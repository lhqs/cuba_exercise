package com.fugang.tuzhuang.web.screens.productline;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.ProductLine;

@UiController("tuzhuang_ProductLine.edit")
@UiDescriptor("product-line-edit.xml")
@EditedEntityContainer("productLineDc")
@LoadDataBeforeShow
public class ProductLineEdit extends StandardEditor<ProductLine> {
}