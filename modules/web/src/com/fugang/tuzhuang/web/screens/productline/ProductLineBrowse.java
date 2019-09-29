package com.fugang.tuzhuang.web.screens.productline;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.ProductLine;

@UiController("tuzhuang_ProductLine.browse")
@UiDescriptor("product-line-browse.xml")
@LookupComponent("productLinesTable")
@LoadDataBeforeShow
public class ProductLineBrowse extends StandardLookup<ProductLine> {
}