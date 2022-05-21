import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TicTacToe {
    static JFrame f = new JFrame();
    static int player = 1;
    static int[][] board = {{0, 0, 0},
                            {0, 0, 0},
                            {0, 0, 0}};
    public static void main(String[] args) {
        

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();
        
        b1.setBounds(20, 20, 152, 152);
        b2.setBounds(172, 20, 152, 152);
        b3.setBounds(324, 20, 152, 152);
        b4.setBounds(20, 172, 152, 152);
        b5.setBounds(172, 172, 152, 152);
        b6.setBounds(324, 172, 152, 152);
        b7.setBounds(20, 324, 152, 152);
        b8.setBounds(172, 324, 152, 152);
        b9.setBounds(324, 324, 152, 152);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b1.getText().toString() == "") {
                    b1.setText("X");
                    board[0][0] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b1.getText().toString() == "") {
                    b1.setText("O");
                    board[0][0] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b2.getText().toString() == "") {
                    b2.setText("X");
                    board[0][1] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b2.getText().toString() == "") {
                    b2.setText("O");
                    board[0][1] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b3.getText().toString() == "") {
                    b3.setText("X");
                    board[0][2] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b3.getText().toString() == "") {
                    b3.setText("O");
                    board[0][2] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b4.getText().toString() == "") {
                    b4.setText("X");
                    board[1][0] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b4.getText().toString() == "") {
                    b4.setText("O");
                    board[1][0] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b5.getText().toString() == "") {
                    b5.setText("X");
                    board[1][1] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b5.getText().toString() == "") {
                    b5.setText("O");
                    board[1][1] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b6.getText().toString() == "") {
                    b6.setText("X");
                    board[1][2] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b6.getText().toString() == "") {
                    b6.setText("O");
                    board[1][2] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b7.getText().toString() == "") {
                    b7.setText("X");
                    board[2][0] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b7.getText().toString() == "") {
                    b7.setText("O");
                    board[2][0] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);;
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b8.getText().toString() == "") {
                    b8.setText("X");
                    board[2][1] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b8.getText().toString() == "") {
                    b8.setText("O");
                    board[2][1] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player == 1 && b9.getText().toString() == "") {
                    b9.setText("X");
                    board[2][2] = player;
                    if (checkWinP1()) {
                        JLabel l = new JLabel("Player 1 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 2;
                }
                else if (player == 2 && b9.getText().toString() == "") {
                    b9.setText("O");
                    board[2][2] = player;
                    if (checkWinP2()) {
                        JLabel l = new JLabel("Player 2 Win");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    } else if (checkNoResult()) {
                        JLabel l = new JLabel("Game Tied");
                        l.setBounds(20, 430, 300, 150);
                        f.add(l);
                    }
                    player = 1;
                }
            }
        });

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        
        f.setLayout(null);
        f.setSize(500, 600);
        f.setVisible(true);
    }

    public static boolean checkWinP1() {
        if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
            return true;
        } else if (board[1][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
            return true;
        } else if (board[2][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
            return true;
        } else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) {
            return true;
        } else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) {
            return true;
        } else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) {
            return true;
        } else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
            return true;
        } else if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) {
            return true;
        }
        return false;
    }

    public static boolean checkWinP2() {
        if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
            return true;
        } else if (board[1][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
            return true;
        } else if (board[2][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
            return true;
        } else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) {
            return true;
        } else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) {
            return true;
        } else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) {
            return true;
        } else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
            return true;
        } else if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2) {
            return true;
        }
        return false;
    }

    public static boolean checkNoResult() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}