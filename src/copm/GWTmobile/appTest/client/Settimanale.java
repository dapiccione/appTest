package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.FormStyle;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Dialog;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.form.fields.SwitchItem;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class Settimanale {
	
	public Panel getSettimanaleView(final String impianto, final NavStack navigationStack, final String gruppo) {
		
        Panel panel = new ScrollablePanel(impianto + " - Settimanale Gruppo : " + gruppo);
        
        DynamicForm form=new DynamicForm();
        form.setFormStyle(FormStyle.STYLE2);

        SwitchItem swItemLUN = new SwitchItem("swItemLUN", "Lunedi' :");
        SwitchItem swItemMAR = new SwitchItem("swItemMAR", "Martedi' :");
        SwitchItem swItemMER = new SwitchItem("swItemMER", "Mercoledi' :");
        SwitchItem swItemGIO = new SwitchItem("swItemGIO", "Giovedi' :");
        SwitchItem swItemVEN = new SwitchItem("swItemVEN", "Venerdi' :");
        SwitchItem swItemSAB = new SwitchItem("swItemSAB", "Sabato :");
        SwitchItem swItemDOM = new SwitchItem("swItemDOM", "Domenica :");
                
        form.setFields(swItemLUN, swItemMAR, swItemMER, swItemGIO, swItemVEN, swItemSAB, swItemDOM);

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
