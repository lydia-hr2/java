package com.kbstar.service;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeListener;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserService implements PrintService{
	
	DAO<String,UserDTO> dao;

	public void register(UserDTO v) {
		System.out.println("Security Check..");
		dao.insert(v);
		System.out.println("Send mail...");
		System.out.println("Send SMS..");
	}

	public void delete(String k) {
		dao.delete(k);
		System.out.println("Send mail..");
	}
	
	public void update(UserDTO v) {

	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public DocPrintJob createPrintJob() {
		return null;
	}

	@Override
	public void addPrintServiceAttributeListener(PrintServiceAttributeListener listener) {
		
	}

	@Override
	public void removePrintServiceAttributeListener(PrintServiceAttributeListener listener) {
		
	}

	@Override
	public PrintServiceAttributeSet getAttributes() {
		return null;
	}

	@Override
	public <T extends PrintServiceAttribute> T getAttribute(Class<T> category) {
		return null;
	}

	@Override
	public DocFlavor[] getSupportedDocFlavors() {
		return null;
	}

	@Override
	public boolean isDocFlavorSupported(DocFlavor flavor) {
		return false;
	}

	@Override
	public Class<?>[] getSupportedAttributeCategories() {
		return null;
	}

	@Override
	public boolean isAttributeCategorySupported(Class<? extends Attribute> category) {
		return false;
	}

	@Override
	public Object getDefaultAttributeValue(Class<? extends Attribute> category) {
		return null;
	}

	@Override
	public Object getSupportedAttributeValues(Class<? extends Attribute> category, DocFlavor flavor,
			AttributeSet attributes) {
		return null;
	}

	@Override
	public boolean isAttributeValueSupported(Attribute attrval, DocFlavor flavor, AttributeSet attributes) {
		return false;
	}

	@Override
	public AttributeSet getUnsupportedAttributes(DocFlavor flavor, AttributeSet attributes) {
		return null;
	}

	@Override
	public ServiceUIFactory getServiceUIFactory() {
		return null;
	}

}
