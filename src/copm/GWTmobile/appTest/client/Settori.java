package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.Alignment;
import com.smartgwt.mobile.client.types.VerticalAlignment;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Dialog;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.fields.StaticTextItem;
import com.smartgwt.mobile.client.widgets.form.fields.SwitchItem;
import com.smartgwt.mobile.client.widgets.layout.HLayout;
import com.smartgwt.mobile.client.widgets.layout.NavStack;
import com.smartgwt.mobile.client.widgets.layout.VLayout;

public class Settori {
	
	public Panel getSettoriView(final String impianto, final NavStack navigationStack, final String gruppo) {
		
        Panel panel = new ScrollablePanel(impianto + " - Settori Gruppo : " + gruppo);

        VLayout vLay = new VLayout();
        vLay.setMembersMargin(5);
        vLay.setLayoutMargin(20);
        //vLay.setLayoutLeftMargin(20);
        
        HLayout hLay1 = new HLayout();
        hLay1.setMembersMargin(5);
        hLay1.setAlign(VerticalAlignment.CENTER);
        hLay1.setAlign(Alignment.CENTER);

        StaticTextItem tiSettore1 = new StaticTextItem("tiSettore1");
        tiSettore1.setValue("Settore1 :");
        SwitchItem swSettore1 = new SwitchItem("swSettore1");
        StaticTextItem tiSettore2 = new StaticTextItem("tiSettore2");
        tiSettore2.setValue("Settore2 :");
        SwitchItem swSettore2 = new SwitchItem("swSettore2");
        StaticTextItem tiSettore3 = new StaticTextItem("tiSettore3");
        tiSettore3.setValue("Settore3 :");
        SwitchItem swSettore3 = new SwitchItem("swSettore3");
        StaticTextItem tiSettore4 = new StaticTextItem("tiSettore4");
        tiSettore4.setValue("Settore4 :");
        SwitchItem swSettore4 = new SwitchItem("swSettore4");
        
        hLay1.addMembers(tiSettore1, swSettore1, tiSettore2, swSettore2, tiSettore3, swSettore3, tiSettore4, swSettore4);
        
        HLayout hLay2 = new HLayout();
        hLay2.setMembersMargin(5);
        hLay2.setAlign(VerticalAlignment.CENTER);
        hLay2.setAlign(Alignment.CENTER);

        StaticTextItem tiSettore5 = new StaticTextItem("tiSettore5");
        tiSettore5.setValue("Settore5 :");
        SwitchItem swSettore5 = new SwitchItem("swSettore5");
        StaticTextItem tiSettore6 = new StaticTextItem("tiSettore6");
        tiSettore6.setValue("Settore6 :");
        SwitchItem swSettore6 = new SwitchItem("swSettore6");
        StaticTextItem tiSettore7 = new StaticTextItem("tiSettore7");
        tiSettore7.setValue("Settore7 :");
        SwitchItem swSettore7 = new SwitchItem("swSettore7");
        StaticTextItem tiSettore8 = new StaticTextItem("tiSettore8");
        tiSettore8.setValue("Settore8 :");
        SwitchItem swSettore8 = new SwitchItem("swSettore8");
        
        hLay2.addMembers(tiSettore5, swSettore5, tiSettore6, swSettore6, tiSettore7, swSettore7, tiSettore8, swSettore8);
        
        StaticTextItem stiTMP = new StaticTextItem("stiTMP");
        stiTMP.setValue("...");
        stiTMP.setTextAlign(Alignment.CENTER);
        
        HLayout hLayF = new HLayout();
        hLayF.setMembersMargin(5);
        hLayF.setAlign(VerticalAlignment.CENTER);
        hLayF.setAlign(Alignment.CENTER);

        StaticTextItem tiSettore61 = new StaticTextItem("tiSettore61");
        tiSettore61.setValue("Settore61 :");
        SwitchItem swSettore61 = new SwitchItem("swSettore61");
        StaticTextItem tiSettore62 = new StaticTextItem("tiSettore62");
        tiSettore62.setValue("Settore62 :");
        SwitchItem swSettore62 = new SwitchItem("swSettore62");
        StaticTextItem tiSettore63 = new StaticTextItem("tiSettore63");
        tiSettore63.setValue("Settore63 :");
        SwitchItem swSettore63 = new SwitchItem("swSettore63");
        StaticTextItem tiSettore64 = new StaticTextItem("tiSettore64");
        tiSettore64.setValue("Settore64 :");
        SwitchItem swSettore64 = new SwitchItem("swSettore64");
        
        hLayF.addMembers(tiSettore61, swSettore61, tiSettore62, swSettore62, tiSettore63, swSettore63, tiSettore64, swSettore64);
        
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
                
        vLay.addMembers(hLay1, hLay2, stiTMP, hLayF);

        panel.addMembers(vLay, btConferma);
        
        return panel;
        
	}

}
