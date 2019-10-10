package com.fugang.tuzhuang.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.Product;

@UiController("tuzhuang_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
@DialogMode(forceDialog = true)
public class ProductEdit extends StandardEditor<Product> {
}