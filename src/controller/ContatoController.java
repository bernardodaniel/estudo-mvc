package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ContatoModel;
import view.ContatoView;

public class ContatoController {

	private ContatoModel model;
	private ContatoView view;
	
	public ContatoController(ContatoModel model, ContatoView view) {
		this.model = model;
		this.view = view;
		
		registraAcoes();
	}
	
	private void registraAcoes() {
		view.getBtnInserir()
			.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					model.setNome(view.getNome());
					model.setSobrenome(view.getSobreNome());
					model.setTelefone(view.getTelefone());
					
					String visualizacao = model.getVisualizacao();
					view.setResultado(visualizacao);
				}
			});
	}
	
	
}
