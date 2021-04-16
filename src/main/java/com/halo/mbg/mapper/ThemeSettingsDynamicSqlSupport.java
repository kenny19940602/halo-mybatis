package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ThemeSettingsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ThemeSettings themeSettings = new ThemeSettings();

    public static final SqlColumn<Integer> id = themeSettings.id;

    public static final SqlColumn<Date> createTime = themeSettings.createTime;

    public static final SqlColumn<Date> updateTime = themeSettings.updateTime;

    public static final SqlColumn<String> settingKey = themeSettings.settingKey;

    public static final SqlColumn<String> themeId = themeSettings.themeId;

    public static final SqlColumn<String> settingValue = themeSettings.settingValue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ThemeSettings extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> settingKey = column("setting_key", JDBCType.VARCHAR);

        public final SqlColumn<String> themeId = column("theme_id", JDBCType.VARCHAR);

        public final SqlColumn<String> settingValue = column("setting_value", JDBCType.LONGVARCHAR);

        public ThemeSettings() {
            super("theme_settings");
        }
    }
}