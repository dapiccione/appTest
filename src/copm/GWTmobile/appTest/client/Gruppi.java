package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.Alignment;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.layout.HLayout;
import com.smartgwt.mobile.client.widgets.layout.NavStack;
import com.smartgwt.mobile.client.widgets.layout.VLayout;

public class Gruppi implements ClickHandler {
	
	String imp;
	NavStack navStack;
	
	public void onClick(ClickEvent event) {
    	MenuGruppo mGruppo = new MenuGruppo();
    	navStack.push(mGruppo.getMenuGruppoView(imp, navStack, ((Button)event.getSource()).getTitle()));
    }
	
	public Panel getGruppiView(final String impianto, final NavStack navigationStack) {
		
		imp = impianto;
		navStack = navigationStack;
		
        Panel panel = new ScrollablePanel(impianto + " - Gruppi");
        
        VLayout vLay = new VLayout();
        vLay.setMembersMargin(10);
        
        
        HLayout hLay1 = new HLayout();
        hLay1.setMembersMargin(10);
        hLay1.setAlign(Alignment.CENTER);
                
	    Button btGruppo1 = new Button();
	    btGruppo1.setTintColor("blue");
	    btGruppo1.setTitle("Gruppo 1");
	    btGruppo1.addClickHandler(this);

	    Button btGruppo2 = new Button();
	    btGruppo2.setTintColor("blue");
	    btGruppo2.setTitle("Gruppo 2");
	    btGruppo2.addClickHandler(this);

	    Button btGruppo3 = new Button();
	    btGruppo3.setTintColor("blue");
	    btGruppo3.setTitle("Gruppo 3");
	    btGruppo3.addClickHandler(this);
	    
	    Button btGruppo4 = new Button();
	    btGruppo4.setTintColor("blue");
	    btGruppo4.setTitle("Gruppo 4");
	    btGruppo4.addClickHandler(this);

	    hLay1.addMembers(btGruppo1, btGruppo2, btGruppo3, btGruppo4);
        
        
        HLayout hLay2 = new HLayout();
        hLay2.setMembersMargin(10);
        hLay2.setAlign(Alignment.CENTER);
                
	    Button btGruppo5 = new Button();
	    btGruppo5.setTintColor("blue");
	    btGruppo5.setTitle("Gruppo 5");
	    btGruppo5.addClickHandler(this);

	    Button btGruppo6 = new Button();
	    btGruppo6.setTintColor("blue");
	    btGruppo6.setTitle("Gruppo 6");
	    btGruppo6.addClickHandler(this);

	    Button btGruppo7 = new Button();
	    btGruppo7.setTintColor("blue");
	    btGruppo7.setTitle("Gruppo 7");
	    btGruppo7.addClickHandler(this);
	    
	    Button btGruppo8 = new Button();
	    btGruppo8.setTintColor("blue");
	    btGruppo8.setTitle("Gruppo 8");
	    btGruppo8.addClickHandler(this);

	    hLay2.addMembers(btGruppo5, btGruppo6, btGruppo7, btGruppo8);
        
        
        HLayout hLay3 = new HLayout();
        hLay3.setMembersMargin(10);
        hLay3.setAlign(Alignment.CENTER);
                
	    Button btGruppo9 = new Button();
	    btGruppo9.setTintColor("blue");
	    btGruppo9.setTitle("Gruppo 9");
	    btGruppo9.addClickHandler(this);

	    Button btGruppo10 = new Button();
	    btGruppo10.setTintColor("blue");
	    btGruppo10.setTitle("Gruppo 10");
	    btGruppo10.addClickHandler(this);

	    Button btGruppo11 = new Button();
	    btGruppo11.setTintColor("blue");
	    btGruppo11.setTitle("Gruppo 11");
	    btGruppo11.addClickHandler(this);
	    
	    Button btGruppo12 = new Button();
	    btGruppo12.setTintColor("blue");
	    btGruppo12.setTitle("Gruppo 12");
	    btGruppo12.addClickHandler(this);

	    hLay3.addMembers(btGruppo9, btGruppo10, btGruppo11, btGruppo12);
        
        
        HLayout hLay4 = new HLayout();
        hLay4.setMembersMargin(10);
        hLay4.setAlign(Alignment.CENTER);
                
	    Button btGruppo13 = new Button();
	    btGruppo13.setTintColor("blue");
	    btGruppo13.setTitle("Gruppo 13");
	    btGruppo13.addClickHandler(this);

	    Button btGruppo14 = new Button();
	    btGruppo14.setTintColor("blue");
	    btGruppo14.setTitle("Gruppo 14");
	    btGruppo14.addClickHandler(this);

	    Button btGruppo15 = new Button();
	    btGruppo15.setTintColor("blue");
	    btGruppo15.setTitle("Gruppo 15");
	    btGruppo15.addClickHandler(this);
	    
	    Button btGruppo16 = new Button();
	    btGruppo16.setTintColor("blue");
	    btGruppo16.setTitle("Gruppo 16");
	    btGruppo16.addClickHandler(this);

	    hLay4.addMembers(btGruppo13, btGruppo14, btGruppo15, btGruppo16);
	    
	    
	    vLay.addMembers(hLay1, hLay2, hLay3, hLay4);
	    
        panel.addMembers(vLay);
        
        return panel;
        
	}
}
