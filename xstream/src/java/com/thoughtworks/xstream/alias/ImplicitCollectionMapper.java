package com.thoughtworks.xstream.alias;

/**
 * A default collection is a special field of an object where any child nodes that do not match with fields will be added.
 *
 * @author Joe Walnes
 */
public interface ImplicitCollectionMapper {

    /**
     * Get the name of the field that acts as the default collection for an object, or return null if there is none.
     */
    String implicitCollectionFieldForType(Class definedIn, Class itemType);

    boolean isImplicitCollectionField(Class definedIn, String fieldName);

}