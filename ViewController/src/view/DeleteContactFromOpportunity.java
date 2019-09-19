package view;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.MyADFUtil;

public class DeleteContactFromOpportunity {
    public DeleteContactFromOpportunity() {
    }

    public void doDeleteContact(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Contact deleted successfully");
        
    }
}
