package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum ConnectionPointType implements Enumeration {
    VPORT(0, "VPORT")
    ;

    private static final Map<String, ConnectionPointType> NAME_MAP;
    private static final Map<Integer, ConnectionPointType> VALUE_MAP;

    static {
        final Builder<String, ConnectionPointType> nb = ImmutableMap.builder();
        final Builder<Integer, ConnectionPointType> vb = ImmutableMap.builder();
        for (ConnectionPointType enumItem : ConnectionPointType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private ConnectionPointType(int value, String name) {
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
     * @return corresponding ConnectionPointType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<ConnectionPointType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding ConnectionPointType item, or null if no such item exists
     */
    public static ConnectionPointType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
