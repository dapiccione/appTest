package copm.GWTmobile.appTest.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.smartgwt.mobile.client.types.FormStyle;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.form.fields.SelectItem;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AppTest implements EntryPoint {

	private NavStack navigationStack;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {	

		       
        DynamicForm form=new DynamicForm();
        form.setFormStyle(FormStyle.STYLE2);

        Panel panel = new ScrollablePanel("Selezione Impianto");
        
        final SelectItem siItem1 = new SelectItem("siItem1", "Seleziona l'Impianto :", "Seleziona l'Impianto");
        siItem1.setValueMap("Impianto 1", "Impianto 2", "Impianto 3", "Impianto 4");
        
        form.setFields(siItem1);

	    Button btConferma = new Button();
	    btConferma.setTitle("Conferma");
	    btConferma.setTintColor("blue");
	    btConferma.addClickHandler(new ClickHandler() {
	    	public void onClick(ClickEvent event) {
            	Login login = new Login();
            	if (siItem1.getValueAsString() == ""){
                    navigationStack.push(login.getLoginView("ImpiantoTMP", navigationStack));
            	}
            	else{
                    navigationStack.push(login.getLoginView(siItem1.getValueAsString(), navigationStack));
            		
            	}
            }
        });

        panel.addMembers(form, btConferma);
		
		navigationStack = new NavStack(panel);

	    RootLayoutPanel.get().add(navigationStack);
	    

/**
	    Button btImp1 = new Button();
	    btImp1.setTitle("Impianto 1");
	    btImp1.setTintColor("blue");
	    btImp1.addClickHandler(new ClickHandler() {
           public void onClick(ClickEvent event) {
            	Login login = new Login();
                navigationStack.push(login.getLoginView(((Button)event.getSource()).getTitle(), navigationStack));
            }
        });

	    Button btImp2 = new Button();
	    btImp2.setTitle("Impianto 2");
	    btImp2.setTintColor("red");
	    btImp2.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	Login login = new Login();
                navigationStack.push(login.getLoginView(((Button)event.getSource()).getTitle(), navigationStack));
            }
        });

	    Button btImp3 = new Button();
	    btImp3.setTitle("Impianto 3");
	    btImp3.setTintColor("yellow");
	    btImp3.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	Login login = new Login();
                navigationStack.push(login.getLoginView(((Button)event.getSource()).getTitle(), navigationStack));
            }
        });

	    Button btImp4 = new Button();
	    btImp4.setTitle("Impianto 4");
	    btImp4.setTintColor("green");
	    btImp4.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	Login login = new Login();
                navigationStack.push(login.getLoginView(((Button)event.getSource()).getTitle(), navigationStack));
            }
        });
*/		
	    
		
	}
	
}
