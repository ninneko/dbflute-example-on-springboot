/*
 * Copyright 2014-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.springboot.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.springboot.dbflute.allcommon.*;
import org.docksidestage.springboot.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_FOLLOWING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberFollowingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberFollowingDbm _instance = new MemberFollowingDbm();
    private MemberFollowingDbm() {}
    public static MemberFollowingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MemberFollowing)et).getMemberFollowingId(), (et, vl) -> ((MemberFollowing)et).setMemberFollowingId(ctl(vl)), "memberFollowingId");
        setupEpg(_epgMap, et -> ((MemberFollowing)et).getMyMemberId(), (et, vl) -> ((MemberFollowing)et).setMyMemberId(cti(vl)), "myMemberId");
        setupEpg(_epgMap, et -> ((MemberFollowing)et).getYourMemberId(), (et, vl) -> ((MemberFollowing)et).setYourMemberId(cti(vl)), "yourMemberId");
        setupEpg(_epgMap, et -> ((MemberFollowing)et).getFollowDatetime(), (et, vl) -> ((MemberFollowing)et).setFollowDatetime((java.time.LocalDateTime)vl), "followDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MemberFollowing)et).getMemberByMyMemberId(), (et, vl) -> ((MemberFollowing)et).setMemberByMyMemberId((OptionalEntity<Member>)vl), "memberByMyMemberId");
        setupEfpg(_efpgMap, et -> ((MemberFollowing)et).getMemberByYourMemberId(), (et, vl) -> ((MemberFollowing)et).setMemberByYourMemberId((OptionalEntity<Member>)vl), "memberByYourMemberId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_FOLLOWING";
    protected final String _tablePropertyName = "memberFollowing";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_FOLLOWING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberFollowingId = cci("MEMBER_FOLLOWING_ID", "MEMBER_FOLLOWING_ID", null, null, Long.class, "memberFollowingId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_357752E6_E67D_4012_8D7C_37DB7A018C91", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMyMemberId = cci("MY_MEMBER_ID", "MY_MEMBER_ID", null, null, Integer.class, "myMemberId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "memberByMyMemberId", null, null, false);
    protected final ColumnInfo _columnYourMemberId = cci("YOUR_MEMBER_ID", "YOUR_MEMBER_ID", null, null, Integer.class, "yourMemberId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "memberByYourMemberId", null, null, false);
    protected final ColumnInfo _columnFollowDatetime = cci("FOLLOW_DATETIME", "FOLLOW_DATETIME", null, null, java.time.LocalDateTime.class, "followDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);

    /**
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberFollowingId() { return _columnMemberFollowingId; }
    /**
     * MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyMemberId() { return _columnMyMemberId; }
    /**
     * YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYourMemberId() { return _columnYourMemberId; }
    /**
     * FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowDatetime() { return _columnFollowDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberFollowingId());
        ls.add(columnMyMemberId());
        ls.add(columnYourMemberId());
        ls.add(columnFollowDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberFollowingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberByMyMemberId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMyMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_FOLLOWING_MY_MEMBER", "memberByMyMemberId", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberFollowingByMyMemberIdList", false);
    }
    /**
     * MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberByYourMemberId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnYourMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_FOLLOWING_YOUR_MEMBER", "memberByYourMemberId", this, MemberDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberFollowingByYourMemberIdList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.springboot.dbflute.exentity.MemberFollowing"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.springboot.dbflute.cbean.MemberFollowingCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.springboot.dbflute.exbhv.MemberFollowingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberFollowing> getEntityType() { return MemberFollowing.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberFollowing newEntity() { return new MemberFollowing(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberFollowing)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberFollowing)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
