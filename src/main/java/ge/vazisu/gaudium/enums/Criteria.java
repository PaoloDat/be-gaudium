package ge.vazisu.gaudium.enums;

import lombok.Getter;

/**
 * Criteria.
 *
 * @author Pavel_Datunashvili
 */
@Getter
public enum Criteria {

    /**
     * Статистика турнира
     */
    TOURNAMENT_R_SOME_GAMES_WITHOUT_DRAW("Серия игр без ничьих в турнире"),
    TOURNAMENT_R_SOME_GAMES_WITHOUT_HOME_WIN("Серия игр без побед хозяев в турнире"),
    TOURNAMENT_R_SOME_GAMES_WITHOUT_AWAY_WIN("Серия игр без побед гостей в турнире"),
    TOURNAMENT_R_SOME_GAMES_WITH_HOME_WIN("Серия игр с преобладанием побед хозяев турнире"),

    TOURNAMENT_HOME_R_SOME_GAMES_WITHOUT_HOME_WIN("Серия игр домашней команды в турнире без побед хозяев"),
    TOURNAMENT_AWAY_R_SOME_GAMES_WITHOUT_HOME_WIN("Серия игр гостевой команды в турнире без побед хозяев"),
    TOURNAMENT_AWAY_R_SOME_GAMES_AWAY_WIN_IN_ROW("Серия игр гостевой команды в турнире с серией побед гостей"),

    TOURNAMENT_R_SOME_GAMES_WITHOUT_FON_POOL("Серия игр без FON пула"),
    TOURNAMENT_R_SOME_GAMES_WITHOUT_FON_MIDDLE("Серия игр без FON мидпулла"),
    TOURNAMENT_R_SOME_GAMES_WITHOUT_FON_UNPOOL("Серия игр без FON противопула"),

    TOURNAMENT_R_SOME_GAMES_WITHOUT_MAN_POOL("Серия игр без MAN пула"),
    TOURNAMENT_R_SOME_GAMES_WITHOUT_MAN_MIDDLE("Серия игр без MAN мидпулла"),
    TOURNAMENT_R_SOME_GAMES_WITHOUT_MAN_UNPOOL("Серия игр без MAN противопула"),

    TOURNAMENT_R_SOME_GAMES_WITH_MAN_POOL("Серия игр с преобладанием MAN пула"),

    TOURNAMENT_HOME_R_SOME_GAMES_WITHOUT_FON_POOL("Серия игр домашней команды в турнире без FON пула"),
    TOURNAMENT_HOME_R_SOME_GAMES_WITHOUT_MAN_POOL("Серия игр домашней команды в турнире без MAN пула"),
    TOURNAMENT_AWAY_R_SOME_GAMES_WITHOUT_FON_POOL("Серия игр гостевой команды в турнире с серией FON противопул подряд"),
    TOURNAMENT_AWAY_R_SOME_GAMES_WITHOUT_MAN_UNPOOL("Серия игр гостевой команды в турнире без MAN противопула"),

    TOURNAMENT_AWAY_TEAM_AWAY_R_SOME_GAMES_WITHOUT_MAN_UNPOOL("Серия игр гостевой команды в гостях без MAN противопула"),

    FON_WDL_R("Серия игр с преобладанием побед хозяев"),
    FON_POOL_R("Серия игр с преобладанием FON пула"),

    /**
     * WDL
     */
    WDL_HOME_R_TEAM_0_WIN("Хозяева - 0 побед в 5 матчах"),
    WDL_HOME_R_TEAM_1_WIN("Хозяева - 1 победа в 5 матчах"),
    WDL_HOME_R_TEAM_2_WIN("Хозяева - 2 победы в 5 матчах"),
    WDL_HOME_R_TEAM_3_WIN("Хозяева - 3 победы в 5 матчах"),
    WDL_HOME_R_TEAM_4_WIN("Хозяева - 4 победы в 5 матчах"),
    WDL_HOME_R_TEAM_2_WIN_IN_ROW("Хозяева - 2 победы подряд"),
    WDL_HOME_R_TEAM_3_WIN_IN_ROW("Хозяева - 3 победы подряд"),
    WDL_HOME_R_TEAM_4_WIN_IN_ROW("Хозяева - 4 победы подряд"),
    WDL_HOME_R_TEAM_5_WIN_IN_ROW("Хозяева - 5 победы подряд"),
    WDL_HOME_TEAM_HOME_R_0_WIN("Хозяева дома - 0 побед в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_1_WIN("Хозяева дома - 1 победа в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_2_WIN("Хозяева дома - 2 победы в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_3_WIN("Хозяева дома - 3 победы в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_4_WIN("Хозяева дома - 4 победы в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_2_WIN_IN_ROW("Хозяева дома - 2 победы подряд"),
    WDL_HOME_TEAM_HOME_R_3_WIN_IN_ROW("Хозяева дома - 3 победы подряд"),
    WDL_HOME_TEAM_HOME_R_4_WIN_IN_ROW("Хозяева дома - 4 победы подряд"),
    WDL_HOME_TEAM_HOME_R_5_WIN_IN_ROW("Хозяева дома - 5 победы подряд"),
    WDL_HOME_R_TEAM_0_DRAW("Хозяева - 0 ничьих в 5 матчах"),
    WDL_HOME_R_TEAM_1_DRAW("Хозяева - 1 ничья в 5 матчах"),
    WDL_HOME_R_TEAM_2_DRAW("Хозяева - 2 ничьи в 5 матчах"),
    WDL_HOME_R_TEAM_3_DRAW("Хозяева - 3 ничьи в 5 матчах"),
    WDL_HOME_R_TEAM_4_DRAW("Хозяева - 4 ничьи в 5 матчах"),
    WDL_HOME_R_TEAM_2_DRAW_IN_ROW("Хозяева - 2 ничьи подряд"),
    WDL_HOME_R_TEAM_3_DRAW_IN_ROW("Хозяева - 3 ничьи подряд"),
    WDL_HOME_R_TEAM_4_DRAW_IN_ROW("Хозяева - 4 ничьи подряд"),
    WDL_HOME_R_TEAM_5_DRAW_IN_ROW("Хозяева - 5 ничьи подряд"),
    WDL_HOME_TEAM_HOME_R_0_DRAW("Хозяева дома - 0 ничьих в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_1_DRAW("Хозяева дома - 1 ничья в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_2_DRAW("Хозяева дома - 2 ничьи в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_3_DRAW("Хозяева дома - 3 ничьи в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_4_DRAW("Хозяева дома - 4 ничьи в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_2_DRAW_IN_ROW("Хозяева дома - 2 ничьи подряд"),
    WDL_HOME_TEAM_HOME_R_3_DRAW_IN_ROW("Хозяева дома - 3 ничьи подряд"),
    WDL_HOME_TEAM_HOME_R_4_DRAW_IN_ROW("Хозяева дома - 4 ничьи подряд"),
    WDL_HOME_TEAM_HOME_R_5_DRAW_IN_ROW("Хозяева дома - 5 ничьи подряд"),
    WDL_HOME_R_TEAM_0_LOSE("Хозяева - 0 поражений в 5 матчах"),
    WDL_HOME_R_TEAM_1_LOSE("Хозяева - 1 поражение в 5 матчах"),
    WDL_HOME_R_TEAM_2_LOSE("Хозяева - 2 поражений в 5 матчах"),
    WDL_HOME_R_TEAM_3_LOSE("Хозяева - 3 поражений в 5 матчах"),
    WDL_HOME_R_TEAM_4_LOSE("Хозяева - 4 поражений в 5 матчах"),
    WDL_HOME_R_TEAM_2_LOSE_IN_ROW("Хозяева - 2 поражений подряд"),
    WDL_HOME_R_TEAM_3_LOSE_IN_ROW("Хозяева - 3 поражений подряд"),
    WDL_HOME_R_TEAM_4_LOSE_IN_ROW("Хозяева - 4 поражений подряд"),
    WDL_HOME_R_TEAM_5_LOSE_IN_ROW("Хозяева - 5 поражений подряд"),
    WDL_HOME_TEAM_HOME_R_0_LOSE("Хозяева дома - 0 поражений в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_1_LOSE("Хозяева дома - 1 поражение в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_2_LOSE("Хозяева дома - 2 поражений в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_3_LOSE("Хозяева дома - 3 поражений в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_4_LOSE("Хозяева дома - 4 поражений в 5 матчах"),
    WDL_HOME_TEAM_HOME_R_2_LOSE_IN_ROW("Хозяева дома - 2 поражений подряд"),
    WDL_HOME_TEAM_HOME_R_3_LOSE_IN_ROW("Хозяева дома - 3 поражений подряд"),
    WDL_HOME_TEAM_HOME_R_4_LOSE_IN_ROW("Хозяева дома - 4 поражений подряд"),
    WDL_HOME_TEAM_HOME_R_5_LOSE_IN_ROW("Хозяева дома - 5 поражений подряд"),
    WDL_AWAY_R_TEAM_0_WIN("Гости - 0 побед в 5 матчах"),
    WDL_AWAY_R_TEAM_1_WIN("Гости - 1 победа в 5 матчах"),
    WDL_AWAY_R_TEAM_2_WIN("Гости - 2 победы в 5 матчах"),
    WDL_AWAY_R_TEAM_3_WIN("Гости - 3 победы в 5 матчах"),
    WDL_AWAY_R_TEAM_4_WIN("Гости - 4 победы в 5 матчах"),
    WDL_AWAY_R_TEAM_2_WIN_IN_ROW("Гости - 2 победы подряд"),
    WDL_AWAY_R_TEAM_3_WIN_IN_ROW("Гости - 3 победы подряд"),
    WDL_AWAY_R_TEAM_4_WIN_IN_ROW("Гости - 4 победы подряд"),
    WDL_AWAY_R_TEAM_5_WIN_IN_ROW("Гости - 5 победы подряд"),
    WDL_AWAY_TEAM_AWAY_R_0_WIN("Гости на выезде - 0 побед в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_1_WIN("Гости на выезде - 1 победа в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_2_WIN("Гости на выезде - 2 победы в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_3_WIN("Гости на выезде - 3 победы в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_4_WIN("Гости на выезде - 4 победы в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_2_WIN_IN_ROW("Гости на выезде - 2 победы подряд"),
    WDL_AWAY_TEAM_AWAY_R_3_WIN_IN_ROW("Гости на выезде - 3 победы подряд"),
    WDL_AWAY_TEAM_AWAY_R_4_WIN_IN_ROW("Гости на выезде - 4 победы подряд"),
    WDL_AWAY_TEAM_AWAY_R_5_WIN_IN_ROW("Гости на выезде - 5 победы подряд"),
    WDL_AWAY_TEAM_R_0_DRAW("Гости - 0 ничьих в 5 матчах"),
    WDL_AWAY_TEAM_R_1_DRAW("Гости - 1 ничья в 5 матчах"),
    WDL_AWAY_TEAM_R_2_DRAW("Гости - 2 ничьи в 5 матчах"),
    WDL_AWAY_TEAM_R_3_DRAW("Гости - 3 ничьи в 5 матчах"),
    WDL_AWAY_TEAM_R_4_DRAW("Гости - 4 ничьи в 5 матчах"),
    WDL_AWAY_TEAM_R_2_DRAW_IN_ROW("Гости - 2 ничьи подряд"),
    WDL_AWAY_TEAM_R_3_DRAW_IN_ROW("Гости - 3 ничьи подряд"),
    WDL_AWAY_TEAM_R_4_DRAW_IN_ROW("Гости - 4 ничьи подряд"),
    WDL_AWAY_TEAM_R_5_DRAW_IN_ROW("Гости - 5 ничьи подряд"),
    WDL_AWAY_TEAM_AWAY_R_0_DRAW("Гости на выезде - 0 ничьих в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_1_DRAW("Гости на выезде - 1 ничья в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_2_DRAW("Гости на выезде - 2 ничьи в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_3_DRAW("Гости на выезде - 3 ничьи в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_4_DRAW("Гости на выезде - 4 ничьи в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_2_DRAW_IN_ROW("Гости на выезде - 2 ничьи подряд"),
    WDL_AWAY_TEAM_AWAY_R_3_DRAW_IN_ROW("Гости на выезде - 3 ничьи подряд"),
    WDL_AWAY_TEAM_AWAY_R_4_DRAW_IN_ROW("Гости на выезде - 4 ничьи подряд"),
    WDL_AWAY_TEAM_AWAY_R_5_DRAW_IN_ROW("Гости на выезде - 5 ничьи подряд"),
    WDL_AWAY_R_TEAM_0_LOSE("Гости - 0 поражений в 5 матчах"),
    WDL_AWAY_R_TEAM_1_LOSE("Гости - 1 поражение в 5 матчах"),
    WDL_AWAY_R_TEAM_2_LOSE("Гости - 2 поражений в 5 матчах"),
    WDL_AWAY_R_TEAM_3_LOSE("Гости - 3 поражений в 5 матчах"),
    WDL_AWAY_R_TEAM_4_LOSE("Гости - 4 поражений в 5 матчах"),
    WDL_AWAY_R_TEAM_2_LOSE_IN_ROW("Гости - 2 поражений подряд"),
    WDL_AWAY_R_TEAM_3_LOSE_IN_ROW("Гости - 3 поражений подряд"),
    WDL_AWAY_R_TEAM_4_LOSE_IN_ROW("Гости - 4 поражений подряд"),
    WDL_AWAY_R_TEAM_5_LOSE_IN_ROW("Гости - 5 поражений подряд"),
    WDL_AWAY_TEAM_AWAY_R_0_LOSE("Гости на выезде - 0 поражений в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_1_LOSE("Гости на выезде - 1 поражение в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_2_LOSE("Гости на выезде - 2 поражений в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_3_LOSE("Гости на выезде - 3 поражений в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_4_LOSE("Гости на выезде - 4 поражений в 5 матчах"),
    WDL_AWAY_TEAM_AWAY_R_2_LOSE_IN_ROW("Гости на выезде - 2 поражений подряд"),
    WDL_AWAY_TEAM_AWAY_R_3_LOSE_IN_ROW("Гости на выезде - 3 поражений подряд"),
    WDL_AWAY_TEAM_AWAY_R_4_LOSE_IN_ROW("Гости на выезде - 4 поражений подряд"),
    WDL_AWAY_TEAM_AWAY_R_5_LOSE_IN_ROW("Гости на выезде - 5 поражений подряд"),

    /**
     * Личные встречи
     */
    H2H_R_1X_SUPERIORITY("Явный перевес хозяев на результат 1Х"),
    H2H_R_HOME_SUPERIORITY("Явный перевес хозяев в личных встречах"),
    H2H_R_HOME_2_WIN_IN_ROW("Личные встречи - 2 победы хозяев подряд");


    private String description;

    Criteria(String description) {
        this.description = description;
    }

    public static String getJson() {
        StringBuilder json = new StringBuilder();
        String template = "{ opt: '%s', text: '%s'},";

        for (Criteria value : values()) {
            json.append(String.format(template, value.name(), compileText(value.name(), value.getDescription())));
        }
        return json.toString();
    }

    private static String compileText(String name, String description) {
        return name.substring(0, name.indexOf("_R")) + "&nbsp;&nbsp;&nbsp;" + description;
    }
}
