/*
 * Copyright 2004-2016 EPAM Systems
 *
 * This file is part of JDI project.
 *
 * JDI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JDI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JDI. If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.jdi.uitests.mobile.appium.elements.base;

import com.epam.jdi.uitests.core.interfaces.base.ISelect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Roman_Iovlev on 7/9/2015.
 */
public class SelectElement extends ClickableText implements ISelect {
    public SelectElement() {
    }

    public SelectElement(By byLocator) {
        super(byLocator);
    }

    public SelectElement(WebElement webElement) {
        super(webElement);
    }

    protected boolean isSelectedAction() {
        return getWebElement().isSelected();
    }

    public void select() {
        click();
    }

    public boolean isSelected() {
        return actions.isSelected(this::isSelectedAction);
    }
}