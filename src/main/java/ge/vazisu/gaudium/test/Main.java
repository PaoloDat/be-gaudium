package ge.vazisu.gaudium.test;

import org.apache.commons.lang3.ObjectUtils;

/**
 * Main.
 *
 * @author Pavel_Datunashvili
 */
public class Main {
    public static void main(String[] args) {
        Integer[] game1 = new Integer[]{1, 0, null};
        Integer[] game2 = new Integer[]{null, 0, null};
        Integer[] game3 = new Integer[]{null, 0, null};
        Integer[] game4 = new Integer[]{null, 0, null};
        Integer[] game5 = new Integer[]{null, 0, null};
        Integer[] game6 = new Integer[]{null, 0, null};
        Integer[] game7 = new Integer[]{null, 0, null};
        Integer[] game8 = new Integer[]{null, 0, null};
        Integer[] game9 = new Integer[]{null, 0, null};
        Integer[] game10 = new Integer[]{null, 0, 2};
        Integer[] game11 = new Integer[]{null, 0, null};
        Integer[] game12 = new Integer[]{null, 0, null};
        Integer[] game13 = new Integer[]{null, 0, null};
        Integer[] game14 = new Integer[]{null, 0, null};
        Integer[] game15 = new Integer[]{1, 0, null};
        Integer[][] arr = {game1, game2, game3, game4, game5, game6, game7,
                game8, game9, game10, game11, game12, game13, game14, game15};

        for (int k1 = 0; k1 < 3; k1++) {
            for (int k2 = 0; k2 < 3; k2++) {
                for (int k3 = 0; k3 < 3; k3++) {
                    for (int k4 = 0; k4 < 3; k4++) {
                        for (int k5 = 0; k5 < 3; k5++) {
                            for (int k6 = 0; k6 < 3; k6++) {
                                for (int k7 = 0; k7 < 3; k7++)
                                    for (int k8 = 0; k8 < 3; k8++) {
                                        for (int k9 = 0; k9 < 3; k9++) {
                                            for (int k10 = 0; k10 < 3; k10++) {
                                                for (int k11 = 0; k11 < 3; k11++) {
                                                    for (int k12 = 0; k12 < 3; k12++) {
                                                        for (int k13 = 0; k13 < 3; k13++) {
                                                            for (int k14 = 0; k14 < 3; k14++) {
                                                                for (int k15 = 0; k15 < 3; k15++) {
                                                                    if (ObjectUtils.allNotNull(arr[0][k1], arr[1][k2], arr[2][k3],
                                                                            arr[3][k4], arr[4][k5],
                                                                            arr[5][k6], arr[6][k7], arr[7][k8], arr[8][k9], arr[9][k10],
                                                                            arr[10][k11], arr[11][k12], arr[12][k13],
                                                                            arr[13][k14], arr[14][k15])) {
                                                                        System.out.println(String.format("%d, %d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,",
                                                                                arr[0][k1], arr[1][k2], arr[2][k3],
                                                                                arr[3][k4], arr[4][k5],
                                                                                arr[5][k6], arr[6][k7], arr[7][k8], arr[8][k9], arr[9][k10],
                                                                                arr[10][k11], arr[11][k12], arr[12][k13],
                                                                                arr[13][k14], arr[14][k15]));
                                                                    }

                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                            }
                        }
                    }
                }
            }
        }


    }
}
