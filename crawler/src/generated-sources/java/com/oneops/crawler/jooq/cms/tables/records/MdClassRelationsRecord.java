/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.MdClassRelations;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MdClassRelationsRecord extends UpdatableRecordImpl<MdClassRelationsRecord> implements Record8<Integer, Integer, Integer, Integer, Boolean, String, String, Timestamp> {

    private static final long serialVersionUID = 1142588037;

    /**
     * Setter for <code>kloopzcm.md_class_relations.link_id</code>.
     */
    public void setLinkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.link_id</code>.
     */
    public Integer getLinkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kloopzcm.md_class_relations.from_class_id</code>.
     */
    public void setFromClassId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.from_class_id</code>.
     */
    public Integer getFromClassId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kloopzcm.md_class_relations.relation_id</code>.
     */
    public void setRelationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.relation_id</code>.
     */
    public Integer getRelationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kloopzcm.md_class_relations.to_class_id</code>.
     */
    public void setToClassId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.to_class_id</code>.
     */
    public Integer getToClassId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>kloopzcm.md_class_relations.is_strong</code>.
     */
    public void setIsStrong(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.is_strong</code>.
     */
    public Boolean getIsStrong() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>kloopzcm.md_class_relations.link_type</code>.
     */
    public void setLinkType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.link_type</code>.
     */
    public String getLinkType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>kloopzcm.md_class_relations.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>kloopzcm.md_class_relations.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>kloopzcm.md_class_relations.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Boolean, String, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Boolean, String, String, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MdClassRelations.MD_CLASS_RELATIONS.LINK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MdClassRelations.MD_CLASS_RELATIONS.FROM_CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MdClassRelations.MD_CLASS_RELATIONS.RELATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MdClassRelations.MD_CLASS_RELATIONS.TO_CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return MdClassRelations.MD_CLASS_RELATIONS.IS_STRONG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MdClassRelations.MD_CLASS_RELATIONS.LINK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MdClassRelations.MD_CLASS_RELATIONS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MdClassRelations.MD_CLASS_RELATIONS.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLinkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFromClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRelationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getToClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIsStrong();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLinkType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLinkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFromClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRelationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getToClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsStrong();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLinkType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value1(Integer value) {
        setLinkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value2(Integer value) {
        setFromClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value3(Integer value) {
        setRelationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value4(Integer value) {
        setToClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value5(Boolean value) {
        setIsStrong(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value6(String value) {
        setLinkType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord value8(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdClassRelationsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Boolean value5, String value6, String value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MdClassRelationsRecord
     */
    public MdClassRelationsRecord() {
        super(MdClassRelations.MD_CLASS_RELATIONS);
    }

    /**
     * Create a detached, initialised MdClassRelationsRecord
     */
    public MdClassRelationsRecord(Integer linkId, Integer fromClassId, Integer relationId, Integer toClassId, Boolean isStrong, String linkType, String description, Timestamp created) {
        super(MdClassRelations.MD_CLASS_RELATIONS);

        set(0, linkId);
        set(1, fromClassId);
        set(2, relationId);
        set(3, toClassId);
        set(4, isStrong);
        set(5, linkType);
        set(6, description);
        set(7, created);
    }
}
