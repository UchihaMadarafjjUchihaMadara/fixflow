package com.founder.fix.fixflow.designer.modeler.ui.property.exclusivegateway;

import org.eclipse.bpmn2.ExclusiveGateway;
import org.eclipse.bpmn2.modeler.core.utils.BusinessObjectUtil;
import org.eclipse.bpmn2.modeler.ui.property.AbstractBpmn2PropertiesComposite;
import org.eclipse.bpmn2.modeler.ui.property.AbstractBpmn2PropertySection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;


public class ExclusiveGatewayCommonPropertySection extends AbstractBpmn2PropertySection {
	
	
	

	@Override
	public boolean appliesTo(IWorkbenchPart part, ISelection selection) {
		EObject eObject = BusinessObjectUtil.getBusinessObjectForSelection(selection);
		boolean enabled = eObject instanceof ExclusiveGateway ;
		return enabled;
	}

	@Override
	protected AbstractBpmn2PropertiesComposite createSectionRoot() {
		return new ExclusiveGatewayCommonPropertiesComposite(this);
	}

}