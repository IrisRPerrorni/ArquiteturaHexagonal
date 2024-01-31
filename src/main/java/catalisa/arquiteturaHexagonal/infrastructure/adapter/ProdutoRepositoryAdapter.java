package catalisa.arquiteturaHexagonal.infrastructure.adapter;

import catalisa.arquiteturaHexagonal.domain.model.Produto;
import catalisa.arquiteturaHexagonal.domain.service.ProdutoService;
import catalisa.arquiteturaHexagonal.infrastructure.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProdutoRepositoryAdapter implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoRepositoryAdapter(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto obterProdutoPorId(Long id) {

        return produtoRepository.findById(id).orElse(null);
    }

    @Override
    public void salvarProduto(Produto produto) {
        produtoRepository.save(produto);

    }

    @Override
    public List<Produto> listarTodosOsProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);

    }
}
