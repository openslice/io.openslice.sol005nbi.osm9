package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link MaxBitRateRequirementsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MaxBitRateRequirementsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MaxBitRateRequirementsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MaxBitRateRequirementsBuilder, as instances can be freely passed around without
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
 * @see MaxBitRateRequirementsBuilder
 * @see Builder
 *
 */
public class MaxBitRateRequirementsBuilder implements Builder<MaxBitRateRequirements> {

    private Uint32 _leaf;
    private Uint32 _root;


    Map<Class<? extends Augmentation<MaxBitRateRequirements>>, Augmentation<MaxBitRateRequirements>> augmentation = Collections.emptyMap();

    public MaxBitRateRequirementsBuilder() {
    }

    public MaxBitRateRequirementsBuilder(MaxBitRateRequirements base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MaxBitRateRequirements>>, Augmentation<MaxBitRateRequirements>> aug =((AugmentationHolder<MaxBitRateRequirements>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._leaf = base.getLeaf();
        this._root = base.getRoot();
    }


    public Uint32 getLeaf() {
        return _leaf;
    }
    
    public Uint32 getRoot() {
        return _root;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<MaxBitRateRequirements>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public MaxBitRateRequirementsBuilder setLeaf(final Uint32 value) {
        this._leaf = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setLeaf(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public MaxBitRateRequirementsBuilder setLeaf(final Long value) {
        return setLeaf(CodeHelpers.compatUint(value));
    }
    
    public MaxBitRateRequirementsBuilder setRoot(final Uint32 value) {
        this._root = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setRoot(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public MaxBitRateRequirementsBuilder setRoot(final Long value) {
        return setRoot(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MaxBitRateRequirementsBuilder addAugmentation(Augmentation<MaxBitRateRequirements> augmentation) {
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
    public MaxBitRateRequirementsBuilder addAugmentation(Class<? extends Augmentation<MaxBitRateRequirements>> augmentationType, Augmentation<MaxBitRateRequirements> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MaxBitRateRequirementsBuilder removeAugmentation(Class<? extends Augmentation<MaxBitRateRequirements>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MaxBitRateRequirementsBuilder doAddAugmentation(Class<? extends Augmentation<MaxBitRateRequirements>> augmentationType, Augmentation<MaxBitRateRequirements> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public MaxBitRateRequirements build() {
        return new MaxBitRateRequirementsImpl(this);
    }

    private static final class MaxBitRateRequirementsImpl
        extends AbstractAugmentable<MaxBitRateRequirements>
        implements MaxBitRateRequirements {
    
        private final Uint32 _leaf;
        private final Uint32 _root;
    
        MaxBitRateRequirementsImpl(MaxBitRateRequirementsBuilder base) {
            super(base.augmentation);
            this._leaf = base.getLeaf();
            this._root = base.getRoot();
        }
    
        @Override
        public Uint32 getLeaf() {
            return _leaf;
        }
        
        @Override
        public Uint32 getRoot() {
            return _root;
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
            result = prime * result + Objects.hashCode(_leaf);
            result = prime * result + Objects.hashCode(_root);
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
            if (!MaxBitRateRequirements.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            MaxBitRateRequirements other = (MaxBitRateRequirements)obj;
            if (!Objects.equals(_leaf, other.getLeaf())) {
                return false;
            }
            if (!Objects.equals(_root, other.getRoot())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MaxBitRateRequirementsImpl otherImpl = (MaxBitRateRequirementsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MaxBitRateRequirements>>, Augmentation<MaxBitRateRequirements>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MaxBitRateRequirements");
            CodeHelpers.appendValue(helper, "_leaf", _leaf);
            CodeHelpers.appendValue(helper, "_root", _root);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
