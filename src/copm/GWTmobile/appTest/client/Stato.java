package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.FormStyle;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.form.fields.StaticTextItem;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class Stato {
	
	public Panel getStatoView(final String impianto, final NavStack navigationStack) {
		
        Panel panel = new ScrollablePanel(impianto + " - Stato Attuale");
        
        DynamicForm form=new DynamicForm();
        form.setFormStyle(FormStyle.STYLE2);
        
        StaticTextItem tiStato1 = new StaticTextItem("tiStaot1");
        tiStato1.setTitle("Stato 1 : ");
        tiStato1.setShowTitle(true);
        tiStato1.setValue("Valore Stato 1");
        
        StaticTextItem tiStato2 = new StaticTextItem("tiStato2");
        tiStato2.setTitle("Stato 2 : ");
        tiStato2.setValue("Valore Stato 2");
        
        StaticTextItem tiStato3 = new StaticTextItem("tiStato3");
        tiStato3.setTitle("Stato 3 : ");
        tiStato3.setValue("Valore Stato 3");
        
        StaticTextItem tiStato4 = new StaticTextItem("tiStato4");
        tiStato4.setTitle("Stato 4 : ");
        tiStato4.setValue("Valore Stato 4");
        
        StaticTextItem tiStato5 = new StaticTextItem("tiStato5");
        tiStato5.setTitle("Stato 5 : ");
        tiStato5.setValue("Valore Stato 5");
        
        form.setFields(tiStato1, tiStato2, tiStato3, tiStato4, tiStato5);        
        
        panel.addMember(form);
        
        return panel;
        
	}

}
