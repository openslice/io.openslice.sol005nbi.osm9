package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum ResourceType implements Enumeration {
    /**
     * delay critical guaranted bit rate
     *
     */
    DelayCriticalGBR(0, "delay-critical-GBR"),
    
    /**
     * guaranted bit rate
     *
     */
    GBR(1, "GBR"),
    
    /**
     * NON guaranted bit rate
     *
     */
    NonGBR(2, "non-GBR")
    ;

    private static final Map<String, ResourceType> NAME_MAP;
    private static final Map<Integer, ResourceType> VALUE_MAP;

    static {
        final Builder<String, ResourceType> nb = ImmutableMap.builder();
        final Builder<Integer, ResourceType> vb = ImmutableMap.builder();
        for (ResourceType enumItem : ResourceType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private ResourceType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getIntValue() {
        return value;
    }

    /**
     * Return the enumeration member whose {@link #getName()} matches specified value.
     *
     * @param name YANG assigned name
     * @return corresponding ResourceType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<ResourceType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding ResourceType item, or null if no such item exists
     */
    public static ResourceType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
