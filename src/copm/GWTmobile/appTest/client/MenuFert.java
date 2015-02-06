package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class MenuFert {
	
	public Panel getMenuFertView(final String impianto, final NavStack navigationStack) {
        Panel panel = new ScrollablePanel(impianto + " - Menu Fert");
        
	    Button btStato = new Button();
	    btStato.setTintColor("blue");
	    btStato.setTitle("Stato Attuale");
	    btStato.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	Stato stato = new Stato();
            	navigationStack.push(stato.getStatoView(impianto, navigationStack));
            }
        });

	    Button btImpostazioni= new Button();
	    btImpostazioni.setTintColor("blue");
	    btImpostazioni.setTitle("Impostazioni");
	    btImpostazioni.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	Impostazioni impostazioni = new Impostazioni();
            	navigationStack.push(impostazioni.getImpostazioniView(impianto, navigationStack));
            }
        });

	    Button btGruppi = new Button();
	    btGruppi.setTintColor("blue");
	    btGruppi.setTitle("Gruppi");
	    btGruppi.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	Gruppi gruppi = new Gruppi();
            	navigationStack.push(gruppi.getGruppiView(impianto, navigationStack));
            }
        });

        panel.addMembers(btStato, btImpostazioni, btGruppi);
        
        return panel;
        
	}

}
