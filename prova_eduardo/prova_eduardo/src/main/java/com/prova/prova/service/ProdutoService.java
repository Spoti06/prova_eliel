package com.prova.prova.service;

import com.prova.prova.models.Produto;
import com.prova.prova.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class ProdutoService {

        @Autowired
        private ProdutoRepository produtoRepository;

        public List<Produto> findAll() {
            return produtoRepository.findAll();
        }

        public Produto criarProduto(Produto produto) {
            return produtoRepository.save(produto);
        }

        public Produto buscarPorId(Long id) {
            return produtoRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        }

        public Produto atualizar(Long id, Produto produto) {
            Produto existente = buscarPorId(id);

            existente.setNome(produto.getNome());
            existente.setDescricao(produto.getDescricao());
            existente.setPreco(produto.getPreco());
            existente.setStatus(produto.getStatus());

            return produtoRepository.save(existente);
        }

        public void deletar(Long id) {
            produtoRepository.deleteById(id);
        }
    }