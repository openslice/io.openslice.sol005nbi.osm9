package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Nsd1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     Nsd1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new Nsd1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of Nsd1Builder, as instances can be freely passed around without
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
 * @see Nsd1Builder
 * @see Builder
 *
 */
public class Nsd1Builder implements Builder<Nsd1> {

    private String _description;



    public Nsd1Builder() {
    }
    public Nsd1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.Description arg) {
        this._description = arg.getDescription();
    }

    public Nsd1Builder(Nsd1 base) {
        this._description = base.getDescription();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.Description</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.Description) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.Description)arg).getDescription();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.Description]");
    }

    public String getDescription() {
        return _description;
    }

    
    public Nsd1Builder setDescription(final String value) {
        this._description = value;
        return this;
    }
    

    @Override
    public Nsd1 build() {
        return new Nsd1Impl(this);
    }

    private static final class Nsd1Impl
        implements Nsd1 {
    
        private final String _description;
    
        Nsd1Impl(Nsd1Builder base) {
            this._description = base.getDescription();
        }
    
        @Override
        public String getDescription() {
            return _description;
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
            result = prime * result + Objects.hashCode(_description);
        
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
            if (!Nsd1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nsd1 other = (Nsd1)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsd1");
            CodeHelpers.appendValue(helper, "_description", _description);
            return helper.toString();
        }
    }
}
