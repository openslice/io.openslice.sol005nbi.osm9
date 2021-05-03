package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.sw.image.desc;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ChecksumAlgorithm;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ChecksumBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ChecksumBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ChecksumBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ChecksumBuilder, as instances can be freely passed around without
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
 * @see ChecksumBuilder
 * @see Builder
 *
 */
public class ChecksumBuilder implements Builder<Checksum> {

    private Class<? extends ChecksumAlgorithm> _algorithm;
    private String _hash;


    Map<Class<? extends Augmentation<Checksum>>, Augmentation<Checksum>> augmentation = Collections.emptyMap();

    public ChecksumBuilder() {
    }

    public ChecksumBuilder(Checksum base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Checksum>>, Augmentation<Checksum>> aug =((AugmentationHolder<Checksum>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._algorithm = base.getAlgorithm();
        this._hash = base.getHash();
    }


    public Class<? extends ChecksumAlgorithm> getAlgorithm() {
        return _algorithm;
    }
    
    public String getHash() {
        return _hash;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Checksum>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public ChecksumBuilder setAlgorithm(final Class<? extends ChecksumAlgorithm> value) {
        this._algorithm = value;
        return this;
    }
    
    public ChecksumBuilder setHash(final String value) {
        this._hash = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ChecksumBuilder addAugmentation(Augmentation<Checksum> augmentation) {
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
    public ChecksumBuilder addAugmentation(Class<? extends Augmentation<Checksum>> augmentationType, Augmentation<Checksum> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ChecksumBuilder removeAugmentation(Class<? extends Augmentation<Checksum>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ChecksumBuilder doAddAugmentation(Class<? extends Augmentation<Checksum>> augmentationType, Augmentation<Checksum> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Checksum build() {
        return new ChecksumImpl(this);
    }

    private static final class ChecksumImpl
        extends AbstractAugmentable<Checksum>
        implements Checksum {
    
        private final Class<? extends ChecksumAlgorithm> _algorithm;
        private final String _hash;
    
        ChecksumImpl(ChecksumBuilder base) {
            super(base.augmentation);
            this._algorithm = base.getAlgorithm();
            this._hash = base.getHash();
        }
    
        @Override
        public Class<? extends ChecksumAlgorithm> getAlgorithm() {
            return _algorithm;
        }
        
        @Override
        public String getHash() {
            return _hash;
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
            result = prime * result + Objects.hashCode(_algorithm);
            result = prime * result + Objects.hashCode(_hash);
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
            if (!Checksum.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Checksum other = (Checksum)obj;
            if (!Objects.equals(_algorithm, other.getAlgorithm())) {
                return false;
            }
            if (!Objects.equals(_hash, other.getHash())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ChecksumImpl otherImpl = (ChecksumImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Checksum>>, Augmentation<Checksum>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Checksum");
            CodeHelpers.appendValue(helper, "_algorithm", _algorithm);
            CodeHelpers.appendValue(helper, "_hash", _hash);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
