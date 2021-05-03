package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.OmNumaType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.Vcpu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.VcpuKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link NodeBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NodeBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NodeBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NodeBuilder, as instances can be freely passed around without
 * worrying about synchronization issues.
 * 
 * <p>
 * As a side note: method chaining results in:
 * <ul>
 *   <li>very efficient Java bytecode, as the method invocation result, in this case the Builder reference, is
 *       on the stack, so further method invocations just need to fill method arguments for the next method
 *       invocation, which is terminated by {@link #build()}, which is then returned from the method</li>
 *   <li>better understanding by humans, as the scope of mutable state (the builder) is kept to a minimum and is
 *       very localized</li>
 *   <li>better optimization oportunities, as the object scope is minimized in terms of invocation (rather than
 *       method) stack, making <a href="https://en.wikipedia.org/wiki/Escape_analysis">escape analysis</a> a lot
 *       easier. Given enough compiler (JIT/AOT) prowess, the cost of th builder object can be completely
 *       eliminated</li>
 * </ul>
 * 
 * @see NodeBuilder
 * @see Builder
 *
 */
public class NodeBuilder implements Builder<Node> {

    private Uint64 _id;
    private Uint64 _memoryMb;
    private OmNumaType _omNumaType;
    private Map<VcpuKey, Vcpu> _vcpu;
    private NodeKey key;


    Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> augmentation = Collections.emptyMap();

    public NodeBuilder() {
    }

    public NodeBuilder(Node base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> aug =((AugmentationHolder<Node>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._memoryMb = base.getMemoryMb();
        this._omNumaType = base.getOmNumaType();
        this._vcpu = base.getVcpu();
    }


    public NodeKey key() {
        return key;
    }
    
    public Uint64 getId() {
        return _id;
    }
    
    public Uint64 getMemoryMb() {
        return _memoryMb;
    }
    
    public OmNumaType getOmNumaType() {
        return _omNumaType;
    }
    
    public Map<VcpuKey, Vcpu> getVcpu() {
        return _vcpu;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Node>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NodeBuilder withKey(final NodeKey key) {
        this.key = key;
        return this;
    }
    
    public NodeBuilder setId(final Uint64 value) {
        this._id = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setId(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public NodeBuilder setId(final BigInteger value) {
        return setId(CodeHelpers.compatUint(value));
    }
    
    public NodeBuilder setMemoryMb(final Uint64 value) {
        this._memoryMb = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMemoryMb(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public NodeBuilder setMemoryMb(final BigInteger value) {
        return setMemoryMb(CodeHelpers.compatUint(value));
    }
    
    public NodeBuilder setOmNumaType(final OmNumaType value) {
        this._omNumaType = value;
        return this;
    }
    public NodeBuilder setVcpu(final Map<VcpuKey, Vcpu> values) {
        this._vcpu = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setVcpu(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NodeBuilder setVcpu(final List<Vcpu> values) {
        return setVcpu(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NodeBuilder addAugmentation(Augmentation<Node> augmentation) {
        return doAddAugmentation(augmentation.implementedInterface(), augmentation);
    }
    
    /**
      * Add or remove an augmentation to this builder's product.
      *
      * @param augmentationType augmentation type to be added or removed
      * @param augmentationValue augmentation value, null if the augmentation type should be removed
      * @return this builder
      * @deprecated Use either {@link #addAugmentation(Augmentation)} or {@link #removeAugmentation(Class)} instead.
      */
    @Deprecated(forRemoval = true)
    public NodeBuilder addAugmentation(Class<? extends Augmentation<Node>> augmentationType, Augmentation<Node> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NodeBuilder removeAugmentation(Class<? extends Augmentation<Node>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NodeBuilder doAddAugmentation(Class<? extends Augmentation<Node>> augmentationType, Augmentation<Node> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Node build() {
        return new NodeImpl(this);
    }

    private static final class NodeImpl
        extends AbstractAugmentable<Node>
        implements Node {
    
        private final Uint64 _id;
        private final Uint64 _memoryMb;
        private final OmNumaType _omNumaType;
        private final Map<VcpuKey, Vcpu> _vcpu;
        private final NodeKey key;
    
        NodeImpl(NodeBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NodeKey(base.getId());
            }
            this._id = key.getId();
            this._memoryMb = base.getMemoryMb();
            this._omNumaType = base.getOmNumaType();
            this._vcpu = CodeHelpers.emptyToNull(base.getVcpu());
        }
    
        @Override
        public NodeKey key() {
            return key;
        }
        
        @Override
        public Uint64 getId() {
            return _id;
        }
        
        @Override
        public Uint64 getMemoryMb() {
            return _memoryMb;
        }
        
        @Override
        public OmNumaType getOmNumaType() {
            return _omNumaType;
        }
        
        @Override
        public Map<VcpuKey, Vcpu> getVcpu() {
            return _vcpu;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_memoryMb);
            result = prime * result + Objects.hashCode(_omNumaType);
            result = prime * result + Objects.hashCode(_vcpu);
            result = prime * result + Objects.hashCode(augmentations());
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!Node.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Node other = (Node)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_memoryMb, other.getMemoryMb())) {
                return false;
            }
            if (!Objects.equals(_omNumaType, other.getOmNumaType())) {
                return false;
            }
            if (!Objects.equals(_vcpu, other.getVcpu())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NodeImpl otherImpl = (NodeImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Node>>, Augmentation<Node>> e : augmentations().entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Node");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_memoryMb", _memoryMb);
            CodeHelpers.appendValue(helper, "_omNumaType", _omNumaType);
            CodeHelpers.appendValue(helper, "_vcpu", _vcpu);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}