package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

@SpringUI(path = "/horizontal")
@Title("HorizontalLayout Demo")
@Theme("valo")
public class  HorizontalLayoutDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout hRoot = new HorizontalLayout();
		hRoot.setWidth("100%");
		hRoot.addComponent(new Button("First"));
		hRoot.addComponent(new Button("Second"));
		hRoot.addComponent(new Button("Third"));
		
		setContent(hRoot);
	}

}
