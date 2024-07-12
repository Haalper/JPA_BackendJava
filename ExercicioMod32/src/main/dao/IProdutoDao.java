package main.dao;

import main.domain.Produto;

public interface IProdutoDao {
    Produto cadastrar(Produto produto);
}
