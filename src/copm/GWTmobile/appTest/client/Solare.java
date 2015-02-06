package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Dialog;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class Solare {
	
	public Panel getSolareView(final String impianto, final NavStack navigationStack, final String gruppo) {
		
        Panel panel = new ScrollablePanel(impianto + " - Solare Gruppo : " + gruppo);
        
        DynamicForm form=new DynamicForm();
                
        form.setFields();

	    Button btConferma = new Button();
	    btConferma.setTitle("Salva");
	    btConferma.setTintColor("blue");
	    btConferma.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	Dialog dialog = new Dialog("Modifiche salvate!");
                dialog.setButtons(Dialog.OK);
                dialog.show();
            }
        });

        panel.addMembers(form, btConferma);
        
        return panel;
        
	}

}
