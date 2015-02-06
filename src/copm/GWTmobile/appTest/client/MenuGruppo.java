package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class MenuGruppo {
	
	public Panel getMenuGruppoView(final String impianto, final NavStack navigationStack, final String gruppo) {

        Panel panel = new ScrollablePanel(impianto + " - Menu Gruppo : " + gruppo);
        
	    Button btSettimanale = new Button();
	    btSettimanale.setTintColor("blue");
	    btSettimanale.setTitle("Settimanale");
	    btSettimanale.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
				Settimanale settimanale = new Settimanale();
				navigationStack.push(settimanale.getSettimanaleView(impianto, navigationStack, gruppo));
            }
        });

	    Button btOrari = new Button();
	    btOrari.setTintColor("blue");
	    btOrari.setTitle("Orari");
	    btOrari.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
				Orari orari = new Orari();
				navigationStack.push(orari.getOrariView(impianto, navigationStack, gruppo));
            }
        });

	    Button btSolare = new Button();
	    btSolare.setTintColor("blue");
	    btSolare.setTitle("Solare");
	    btSolare.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
				Solare solare = new Solare();
				navigationStack.push(solare.getSolareView(impianto, navigationStack, gruppo));
            }
        });

	    Button btFertilizzanti = new Button();
	    btFertilizzanti.setTintColor("blue");
	    btFertilizzanti.setTitle("Fertilizzanti");
	    btFertilizzanti.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
				Fertilizzanti fertilizzanti = new Fertilizzanti();
				navigationStack.push(fertilizzanti.getFertilizzantiView(impianto, navigationStack, gruppo));
            }
        });

	    Button btSettori = new Button();
	    btSettori.setTintColor("blue");
	    btSettori.setTitle("Settori");
	    btSettori.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
				Settori settori = new Settori();
				navigationStack.push(settori.getSettoriView(impianto, navigationStack, gruppo));
            }
        });

	    
        panel.addMembers(btSettimanale, btOrari, btSolare, btFertilizzanti, btSettori);
        
        return panel;
        
	}

}
