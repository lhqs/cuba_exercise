package com.fugang.tuzhuang.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.Product;

@UiController("tuzhuang_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}