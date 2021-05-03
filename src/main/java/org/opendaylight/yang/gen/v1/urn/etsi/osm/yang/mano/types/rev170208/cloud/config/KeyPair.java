package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Used to configure the list of public keys to be injected as part of ns 
 * instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list key-pair {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf key {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/cloud-config/key-pair</i>
 * 
 * <p>To create instances of this class use {@link KeyPairBuilder}.
 * @see KeyPairBuilder
 * @see KeyPairKey
 *
 */
public interface KeyPair
    extends
    ChildOf<CloudConfig>,
    Augmentable<KeyPair>,
    Identifiable<KeyPairKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("key-pair");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.KeyPair> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.KeyPair.class;
    }
    
    /**
     * Name of this key pair
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Key associated with this key pair
     *
     *
     *
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable String getKey();
    
    @Override
    KeyPairKey key();

}

