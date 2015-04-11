package org.activiti.designer.property;

import org.activiti.bpmn.model.MessageFlow;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class PropertyMessageFlowFilter extends ActivitiPropertyFilter {
	
	@Override
	protected boolean accept(PictogramElement pe) {
		Object bo = getBusinessObject(pe);
		if (bo instanceof MessageFlow) {
			return true;
		}
		return false;
	}

}