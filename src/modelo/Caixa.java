package modelo;

import java.util.List;

/**
 * 
 * @author Dione
 *
 */
public class Caixa implements CaixaAssinaturaNivel {
	private String name;
	private List<CaixaAssinaturaNivel> itens;

	public Caixa(String name, List<CaixaAssinaturaNivel> itens) {
		this.name = name;
		this.itens= itens;
	}

	@Override
	public void imprimir(String structure) {
		System.out.println(structure + name);
		for (CaixaAssinaturaNivel child : itens) {
			child.imprimir(structure + "| ");
		}
	}
}
