package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.FormStyle;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Dialog;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.form.fields.TimeItem;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class Orari {
	
	public Panel getOrariView(final String impianto, final NavStack navigationStack, final String gruppo) {
		
        Panel panel = new ScrollablePanel(impianto + " - Orari Gruppo : " + gruppo);
        
        DynamicForm form1=new DynamicForm();
        form1.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem1I = new TimeItem("tiItem1I", "Orario 1 I :", "Setta Orario...");
        TimeItem tiItem1F = new TimeItem("tiItem1F", "Orario 1 F :", "Setta Orario...");
        form1.setFields(tiItem1I, tiItem1F);
        
        DynamicForm form2=new DynamicForm();
        form2.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem2I = new TimeItem("tiItem2I", "Orario 2 I :", "Setta Orario...");
        TimeItem tiItem2F = new TimeItem("tiItem2F", "Orario 2 F :", "Setta Orario...");
        form2.setFields(tiItem2I, tiItem2F);
        
        DynamicForm form3=new DynamicForm();
        form3.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem3I = new TimeItem("tiItem3I", "Orario 3 I :", "Setta Orario...");
        TimeItem tiItem3F = new TimeItem("tiItem3F", "Orario 3 F :", "Setta Orario...");
        form3.setFields(tiItem3I, tiItem3F);
        
        DynamicForm form4=new DynamicForm();
        form4.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem4I = new TimeItem("tiItem4I", "Orario 4 I :", "Setta Orario...");
        TimeItem tiItem4F = new TimeItem("tiItem4F", "Orario 4 F :", "Setta Orario...");
        form4.setFields(tiItem4I, tiItem4F);
        
        DynamicForm form5=new DynamicForm();
        form5.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem5I = new TimeItem("tiItem5I", "Orario 5 I :", "Setta Orario...");
        TimeItem tiItem5F = new TimeItem("tiItem5F", "Orario 5 F :", "Setta Orario...");
        form5.setFields(tiItem5I, tiItem5F);
        
        DynamicForm form6=new DynamicForm();
        form6.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem6I = new TimeItem("tiItem6I", "Orario 6 I :", "Setta Orario...");
        TimeItem tiItem6F = new TimeItem("tiItem6F", "Orario 6 F :", "Setta Orario...");
        form6.setFields(tiItem6I, tiItem6F);
        
        DynamicForm form7=new DynamicForm();
        form7.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem7I = new TimeItem("tiItem7I", "Orario 7 I :", "Setta Orario...");
        TimeItem tiItem7F = new TimeItem("tiItem7F", "Orario 7 F :", "Setta Orario...");
        form7.setFields(tiItem7I, tiItem7F);
        
        DynamicForm form8=new DynamicForm();
        form8.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem8I = new TimeItem("tiItem8I", "Orario 8 I :", "Setta Orario...");
        TimeItem tiItem8F = new TimeItem("tiItem8F", "Orario 8 F :", "Setta Orario...");
        form8.setFields(tiItem8I, tiItem8F);
        
        DynamicForm form9=new DynamicForm();
        form9.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem9I = new TimeItem("tiItem9I", "Orario 9 I :", "Setta Orario...");
        TimeItem tiItem9F = new TimeItem("tiItem9F", "Orario 9 F :", "Setta Orario...");
        form9.setFields(tiItem9I, tiItem9F);
        
        DynamicForm form10=new DynamicForm();
        form10.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem10I = new TimeItem("tiItem10I", "Orario 10 I :", "Setta Orario...");
        TimeItem tiItem10F = new TimeItem("tiItem10F", "Orario 10 F :", "Setta Orario...");
        form10.setFields(tiItem10I, tiItem10F);
        
        DynamicForm form11=new DynamicForm();
        form11.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem11I = new TimeItem("tiItem11I", "Orario 11 I :", "Setta Orario...");
        TimeItem tiItem11F = new TimeItem("tiItem11F", "Orario 11 F :", "Setta Orario...");
        form11.setFields(tiItem11I, tiItem11F);
        
        DynamicForm form12=new DynamicForm();
        form12.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem12I = new TimeItem("tiItem12I", "Orario 12 I :", "Setta Orario...");
        TimeItem tiItem12F = new TimeItem("tiItem12F", "Orario 12 F :", "Setta Orario...");
        form12.setFields(tiItem12I, tiItem12F);
        
        DynamicForm form13=new DynamicForm();
        form13.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem13I = new TimeItem("tiItem13I", "Orario 13 I :", "Setta Orario...");
        TimeItem tiItem13F = new TimeItem("tiItem13F", "Orario 13 F :", "Setta Orario...");
        form13.setFields(tiItem13I, tiItem13F);
        
        DynamicForm form14=new DynamicForm();
        form14.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem14I = new TimeItem("tiItem14I", "Orario 14 I :", "Setta Orario...");
        TimeItem tiItem14F = new TimeItem("tiItem14F", "Orario 14 F :", "Setta Orario...");
        form14.setFields(tiItem14I, tiItem14F);
        
        DynamicForm form15=new DynamicForm();
        form15.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem15I = new TimeItem("tiItem15I", "Orario 15 I :", "Setta Orario...");
        TimeItem tiItem15F = new TimeItem("tiItem15F", "Orario 15 F :", "Setta Orario...");
        form15.setFields(tiItem15I, tiItem15F);
        
        DynamicForm form16=new DynamicForm();
        form16.setFormStyle(FormStyle.STYLE2);
        TimeItem tiItem16I = new TimeItem("tiItem16I", "Orario 16 I :", "Setta Orario...");
        TimeItem tiItem16F = new TimeItem("tiItem16F", "Orario 16 F :", "Setta Orario...");
        form16.setFields(tiItem16I, tiItem16F);

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

        panel.addMembers(form1, form2, form3, form4, form5, form6, form7, form8, form9, form10, form11, form12, form13, form14, form15, form16, btConferma);
        
        return panel;
        
	}

}
