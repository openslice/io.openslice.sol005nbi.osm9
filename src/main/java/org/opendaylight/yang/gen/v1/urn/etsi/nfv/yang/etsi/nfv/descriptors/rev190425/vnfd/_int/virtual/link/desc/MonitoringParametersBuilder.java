package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc;
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
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link MonitoringParametersBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MonitoringParametersBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MonitoringParametersBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MonitoringParametersBuilder, as instances can be freely passed around without
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
 * @see MonitoringParametersBuilder
 * @see Builder
 *
 */
public class MonitoringParametersBuilder implements Builder<MonitoringParameters> {

    private Uint64 _collectionPeriod;
    private String _id;
    private String _name;
    private String _performanceMetric;
    private MonitoringParametersKey key;


    Map<Class<? extends Augmentation<MonitoringParameters>>, Augmentation<MonitoringParameters>> augmentation = Collections.emptyMap();

    public MonitoringParametersBuilder() {
    }
    public MonitoringParametersBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter arg) {
        this._name = arg.getName();
        this._performanceMetric = arg.getPerformanceMetric();
        this._collectionPeriod = arg.getCollectionPeriod();
    }

    public MonitoringParametersBuilder(MonitoringParameters base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MonitoringParameters>>, Augmentation<MonitoringParameters>> aug =((AugmentationHolder<MonitoringParameters>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._collectionPeriod = base.getCollectionPeriod();
        this._name = base.getName();
        this._performanceMetric = base.getPerformanceMetric();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter)arg).getName();
            this._performanceMetric = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter)arg).getPerformanceMetric();
            this._collectionPeriod = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter)arg).getCollectionPeriod();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter]");
    }

    public MonitoringParametersKey key() {
        return key;
    }
    
    public Uint64 getCollectionPeriod() {
        return _collectionPeriod;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPerformanceMetric() {
        return _performanceMetric;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<MonitoringParameters>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public MonitoringParametersBuilder withKey(final MonitoringParametersKey key) {
        this.key = key;
        return this;
    }
    
    public MonitoringParametersBuilder setCollectionPeriod(final Uint64 value) {
        this._collectionPeriod = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCollectionPeriod(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public MonitoringParametersBuilder setCollectionPeriod(final BigInteger value) {
        return setCollectionPeriod(CodeHelpers.compatUint(value));
    }
    
    public MonitoringParametersBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public MonitoringParametersBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public MonitoringParametersBuilder setPerformanceMetric(final String value) {
        this._performanceMetric = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MonitoringParametersBuilder addAugmentation(Augmentation<MonitoringParameters> augmentation) {
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
    public MonitoringParametersBuilder addAugmentation(Class<? extends Augmentation<MonitoringParameters>> augmentationType, Augmentation<MonitoringParameters> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MonitoringParametersBuilder removeAugmentation(Class<? extends Augmentation<MonitoringParameters>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MonitoringParametersBuilder doAddAugmentation(Class<? extends Augmentation<MonitoringParameters>> augmentationType, Augmentation<MonitoringParameters> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public MonitoringParameters build() {
        return new MonitoringParametersImpl(this);
    }

    private static final class MonitoringParametersImpl
        extends AbstractAugmentable<MonitoringParameters>
        implements MonitoringParameters {
    
        private final Uint64 _collectionPeriod;
        private final String _id;
        private final String _name;
        private final String _performanceMetric;
        private final MonitoringParametersKey key;
    
        MonitoringParametersImpl(MonitoringParametersBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new MonitoringParametersKey(base.getId());
            }
            this._id = key.getId();
            this._collectionPeriod = base.getCollectionPeriod();
            this._name = base.getName();
            this._performanceMetric = base.getPerformanceMetric();
        }
    
        @Override
        public MonitoringParametersKey key() {
            return key;
        }
        
        @Override
        public Uint64 getCollectionPeriod() {
            return _collectionPeriod;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getPerformanceMetric() {
            return _performanceMetric;
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
            result = prime * result + Objects.hashCode(_collectionPeriod);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_performanceMetric);
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
            if (!MonitoringParameters.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            MonitoringParameters other = (MonitoringParameters)obj;
            if (!Objects.equals(_collectionPeriod, other.getCollectionPeriod())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_performanceMetric, other.getPerformanceMetric())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MonitoringParametersImpl otherImpl = (MonitoringParametersImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MonitoringParameters>>, Augmentation<MonitoringParameters>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MonitoringParameters");
            CodeHelpers.appendValue(helper, "_collectionPeriod", _collectionPeriod);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_performanceMetric", _performanceMetric);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
