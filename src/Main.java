import controller.ContatoController;
import model.ContatoModel;
import view.ContatoView;

public class Main {

	public static void main(String[] args) {
		ContatoModel m = new ContatoModel();
		ContatoView v = new ContatoView();
		ContatoController c = new ContatoController(m, v);
		
		v.setVisible(true);

	}

}
