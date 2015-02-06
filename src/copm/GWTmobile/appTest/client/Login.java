package copm.GWTmobile.appTest.client;

import com.smartgwt.mobile.client.types.FormStyle;
import com.smartgwt.mobile.client.widgets.Button;
import com.smartgwt.mobile.client.widgets.Panel;
import com.smartgwt.mobile.client.widgets.ScrollablePanel;
import com.smartgwt.mobile.client.widgets.events.ClickEvent;
import com.smartgwt.mobile.client.widgets.events.ClickHandler;
import com.smartgwt.mobile.client.widgets.form.DynamicForm;
import com.smartgwt.mobile.client.widgets.form.fields.TextItem;
import com.smartgwt.mobile.client.widgets.layout.NavStack;

public class Login {
	
	public Panel getLoginView(final String impianto, final NavStack navigationStack) {
		
        Panel panel = new ScrollablePanel(impianto + " - Login");
        
        DynamicForm form=new DynamicForm();
        form.setFormStyle(FormStyle.STYLE2);
        
        TextItem tbLogin = new TextItem("Login", "inserire il PIN: ", "[PIN]");
        tbLogin.setDefaultValue("PIN");
        form.setFields(tbLogin);

	    Button btLogin = new Button();
	    btLogin.setTitle("Login");
	    btLogin.setTintColor("blue");
	    btLogin.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	MenuFert menuFert = new MenuFert();
            	navigationStack.push(menuFert.getMenuFertView(impianto, navigationStack));
            }
        });

        panel.addMembers(form, btLogin);
        
        return panel;
        
	}

}
