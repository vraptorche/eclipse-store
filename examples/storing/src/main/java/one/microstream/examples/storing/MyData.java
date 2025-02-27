
package one.microstream.examples.storing;

/*-
 * #%L
 * EclipseStore Example Storing
 * %%
 * Copyright (C) 2023 MicroStream Software
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

public class MyData {
    private String name;
    private int intValue;

    public MyData(final String content) {
        super();
        this.name = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getIntegerValue() {
        return this.intValue;
    }

    public void setIntValue(final int integerValue) {
        this.intValue = integerValue;
    }

    @Override
    public String toString() {
        return this.name + " value: " + this.intValue;
    }

}
