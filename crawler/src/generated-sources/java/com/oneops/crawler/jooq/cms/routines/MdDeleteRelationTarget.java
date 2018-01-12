/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MdDeleteRelationTarget extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1356540881;

    /**
     * The parameter <code>kloopzcm.md_delete_relation_target.p_link_id</code>.
     */
    public static final Parameter<Integer> P_LINK_ID = createParameter("p_link_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public MdDeleteRelationTarget() {
        super("md_delete_relation_target", Kloopzcm.KLOOPZCM);

        addInParameter(P_LINK_ID);
    }

    /**
     * Set the <code>p_link_id</code> parameter IN value to the routine
     */
    public void setPLinkId(Integer value) {
        setValue(P_LINK_ID, value);
    }
}