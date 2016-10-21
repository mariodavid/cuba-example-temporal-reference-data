package com.company.cetrd.web.order;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.cetrd.entity.Order
import com.haulmont.cuba.gui.components.Component
import com.haulmont.cuba.gui.components.DateField
import com.haulmont.cuba.gui.components.PickerField

import javax.inject.Named;

public class OrderEdit extends AbstractEditor<Order> {

    @Named("fieldGroup.taxRate")
    PickerField taxRatePickerField

    @Named("fieldGroup.paymentMethod")
    PickerField paymentMethodPickerField

    @Named("fieldGroup.orderDate")
    DateField orderDateField


    @Override
    protected void postInit() {

        initializeTemporalPickerField(taxRatePickerField)
        initializeTemporalPickerField(paymentMethodPickerField)



    }

    protected void initializeTemporalPickerField(PickerField pickerField) {
        if (item.orderDate) {
            activatePickerField(pickerField, item.orderDate)
        } else {
            deactivatePickerField(pickerField, "Order Date has to be choosen first")
        }

        orderDateField.addValueChangeListener(new Component.ValueChangeListener() {
            @Override
            void valueChanged(Component.ValueChangeEvent e) {

                if (e.value != null) {
                    activatePickerField(pickerField, (Date) e.value)
                }
            }
        })
    }

    protected void activatePickerField(PickerField pickerField, Date validReferenceDate) {

        PickerField.LookupAction lookupAction = (PickerField.LookupAction) pickerField.getAction("lookup")
        lookupAction.lookupScreenParams = [validReferenceDate: validReferenceDate]
        pickerField.setEnabled(true)
        pickerField.setDescription("")
    }

    protected void deactivatePickerField(PickerField pickerField, String description) {
        pickerField.setEnabled(false)
        pickerField.setDescription(description)
    }

}