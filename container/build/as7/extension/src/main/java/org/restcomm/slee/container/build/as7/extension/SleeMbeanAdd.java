package org.restcomm.slee.container.build.as7.extension;

import org.jboss.as.controller.AbstractAddStepHandler;
import org.jboss.as.controller.OperationContext;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.as.controller.PathAddress;
import org.jboss.as.controller.registry.Resource;
import org.jboss.dmr.ModelNode;

import static org.jboss.as.controller.descriptions.ModelDescriptionConstants.OP_ADDR;

class SleeMbeanAdd extends AbstractAddStepHandler {

    static final SleeMbeanAdd INSTANCE = new SleeMbeanAdd();

    private SleeMbeanAdd() {
    }

    @Override
    protected void populateModel(final ModelNode operation, final ModelNode model) throws OperationFailedException {
        PathAddress address = PathAddress.pathAddress(operation.require(OP_ADDR));
        //String name = SleeMbeanDefinition.NAME_ATTR.getName();
        //model.get(name).set(address.getLastElement().getValue());

        SleeMbeanDefinition.NAME_ATTR.validateAndSet(operation, model);
        //for (SimpleAttributeDefinition def : MBEAN_ATTRIBUTES) {
        //    def.validateAndSet(operation, model);
        //}
    }

    @Override
    protected void performRuntime(OperationContext context, ModelNode operation, Resource resource)
            throws OperationFailedException {

        final PathAddress address = PathAddress.pathAddress(operation.get(OP_ADDR));
        final String mbeanName = address.getLastElement().getValue();

        // here we can add mbeans with reflection usage
    }
}
