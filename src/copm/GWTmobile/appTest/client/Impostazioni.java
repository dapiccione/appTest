package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.Alignment;
import com.smartgwt.mobile.client.types.FormStyle;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Dialog;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.form.fields.CheckboxItem;
import com.smartgwt.mobile.client.widgets.form.fields.DateItem;
import com.smartgwt.mobile.client.widgets.form.fields.SelectItem;
import com.smartgwt.mobile.client.widgets.form.fields.SwitchItem;
import com.smartgwt.mobile.client.widgets.form.fields.TextItem;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class Impostazioni {
	
	public Panel getImpostazioniView(final String impianto, final NavStack navigationStack) {
		
        Panel panel = new ScrollablePanel(impianto + " - Impostazioni");
        
        DynamicForm form=new DynamicForm();
        form.setFormStyle(FormStyle.STYLE2);
        
        TextItem tbImp1 = new TextItem("Imp1", "Impostazione 1 - TextItem : ", "Impostazione 1");
        tbImp1.setDefaultValue("Impostazione 1");
        tbImp1.setTextAlign(Alignment.RIGHT);
        
        SwitchItem swItem1 = new SwitchItem("swItem1", "Impostazione 2 - SwitchItem :");
        
        CheckboxItem cbItem1 = new CheckboxItem("cbItem1", "Impostazione 3 - CheckboxItem :");
        
        DateItem diItem1 = new DateItem("diItem1", "Impostazione 4 - DateItem :", "DateItem");
        
        SelectItem siItem1 = new SelectItem("siItem1", "Impostazione 5 - SelectItem :", "SelectItem");
        siItem1.setValueMap("Valore1", "Valore 2", "Valore 3");
        
        
        
        form.setFields(tbImp1, swItem1, cbItem1, diItem1, siItem1);

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
