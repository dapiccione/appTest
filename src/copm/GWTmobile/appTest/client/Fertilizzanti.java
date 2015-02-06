package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.FormStyle;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Dialog;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.form.fields.TextItem;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class Fertilizzanti {
	
	public Panel getFertilizzantiView(final String impianto, final NavStack navigationStack, final String gruppo) {
		
        Panel panel = new ScrollablePanel(impianto + " - Fertilizzanti Gruppo : " + gruppo);
        
        DynamicForm form=new DynamicForm();
        form.setFormStyle(FormStyle.STYLE2);        

        TextItem tbDosatore1 = new TextItem("tbDosatore1", "Dosatore 1 : ", "Dosatore 1");
        TextItem tbDosatore2 = new TextItem("tbDosatore2", "Dosatore 2 : ", "Dosatore 2");
        TextItem tbDosatore3 = new TextItem("tbDosatore3", "Dosatore 3 : ", "Dosatore 3");
        TextItem tbDosatore4 = new TextItem("tbDosatore4", "Dosatore 4 : ", "Dosatore 4");
        TextItem tbDosatore5 = new TextItem("tbDosatore5", "Dosatore 5 : ", "Dosatore 5");

        TextItem tbPH = new TextItem("tbPH", "PH : ", "PH");
        TextItem tbConducubilita = new TextItem("tbConducubilita", "Conducubilita' : ", "Conducubilita");
                
        form.setFields(tbDosatore1, tbDosatore2, tbDosatore3, tbDosatore4, tbDosatore5, tbPH, tbConducubilita);

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
