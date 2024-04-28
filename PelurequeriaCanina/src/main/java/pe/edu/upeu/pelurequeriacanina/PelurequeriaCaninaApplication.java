package pe.edu.upeu.pelurequeriacanina;

import pe.edu.upeu.pelurequeriacanina.igu.Principal;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PelurequeriaCaninaApplication {

	public static void main(String[] args) {
            Principal princ = new Principal();
            princ.setVisible(true);
            princ.setLocationRelativeTo(null);
	}

}
