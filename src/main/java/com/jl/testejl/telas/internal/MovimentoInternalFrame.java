/*
 */
package com.jl.testejl.telas.internal;

import com.google.common.base.Strings;
import com.jl.testejl.enums.TipoMovimento;
import com.jl.testejl.model.MovimentoEstoque;
import com.jl.testejl.model.Produto;
import com.jl.testejl.model.cinterface.Services;
import com.jl.testejl.service.MovimentoService;
import com.jl.testejl.service.ProdutoService;
import com.jl.testejl.telas.modal.PesquisarProduto;
import com.jl.testejl.util.LimparFields;
import com.jl.testejl.util.TableModelUtil;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author francisco
 */
public class MovimentoInternalFrame extends javax.swing.JInternalFrame {

    private Services service;
    private Produto item;
    private MovimentoEstoque movimento;

    public MovimentoInternalFrame() {
        initComponents();
        this.item = new Produto();
        this.movimento = new MovimentoEstoque();
        this.loadTable();
        this.loadTable();
    }

    public void setMovimentoService(Services service) {
        this.service = service;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movimentoButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        radioButtonSaida = new javax.swing.JRadioButton();
        radioButtonEntrada = new javax.swing.JRadioButton();
        radioButtonDevolucao = new javax.swing.JRadioButton();
        fieldPanel = new javax.swing.JPanel();
        fieldPesquisar = new javax.swing.JTextField();
        cmdPesquisar = new javax.swing.JButton();
        fieldEstoque = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaObservacao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cmdAdicionar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        fieldPesquisarMovimento = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Moviento Estoque");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        movimentoButtonGroup.add(radioButtonSaida);
        radioButtonSaida.setText("Saída");

        movimentoButtonGroup.add(radioButtonEntrada);
        radioButtonEntrada.setSelected(true);
        radioButtonEntrada.setText("Entrada");

        movimentoButtonGroup.add(radioButtonDevolucao);
        radioButtonDevolucao.setText("Devolução");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioButtonEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonSaida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonDevolucao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioButtonEntrada)
                    .addComponent(radioButtonSaida)
                    .addComponent(radioButtonDevolucao))
                .addContainerGap())
        );

        fieldPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fieldPesquisar.setEditable(false);

        cmdPesquisar.setText("Pesquisar");
        cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade");

        jLabel2.setText("Descrição");

        textAreaObservacao.setColumns(20);
        textAreaObservacao.setRows(5);
        jScrollPane1.setViewportView(textAreaObservacao);

        jLabel3.setText("Observações");

        cmdAdicionar.setText("Add");
        cmdAdicionar.setEnabled(false);
        cmdAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fieldPanelLayout = new javax.swing.GroupLayout(fieldPanel);
        fieldPanel.setLayout(fieldPanelLayout);
        fieldPanelLayout.setHorizontalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(fieldPanelLayout.createSequentialGroup()
                        .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(fieldPanelLayout.createSequentialGroup()
                                .addComponent(fieldPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdPesquisar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(fieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fieldPanelLayout.createSequentialGroup()
                        .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cmdAdicionar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fieldPanelLayout.setVerticalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdPesquisar)
                    .addComponent(fieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdAdicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇÃO", "QTD", "TIPO MOVIMENTO"
            }
        ));
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(0).setPreferredWidth(45);
            table.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPesquisarMovimento)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldPesquisarMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdicionarActionPerformed
        this.addMovimento();
    }//GEN-LAST:event_cmdAdicionarActionPerformed

    private void cmdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPesquisarActionPerformed
        PesquisarProduto modal = new PesquisarProduto(new JFrame(), true);
        modal.setVisible(true);
        this.item = modal.getProduto();
        if (Objects.isNull(this.item)) {
            return;
        }
        fieldPesquisar.setText(this.item.getDescricao());
        fieldEstoque.requestFocus();
        this.cmdAdicionar.setEnabled(true);
    }//GEN-LAST:event_cmdPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdicionar;
    private javax.swing.JButton cmdPesquisar;
    private javax.swing.JTextField fieldEstoque;
    private javax.swing.JPanel fieldPanel;
    private javax.swing.JTextField fieldPesquisar;
    private javax.swing.JTextField fieldPesquisarMovimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup movimentoButtonGroup;
    private javax.swing.JRadioButton radioButtonDevolucao;
    private javax.swing.JRadioButton radioButtonEntrada;
    private javax.swing.JRadioButton radioButtonSaida;
    private javax.swing.JTable table;
    private javax.swing.JTextArea textAreaObservacao;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        String[] cols = {"ID", "DESCRICAO", "QTD", "TIPO MOVIMENTO"};
        ArrayList rows = new ArrayList();
        this.service = new MovimentoService();
        this.service.findAll().forEach(view -> {
            MovimentoEstoque mov = ((MovimentoEstoque) view);
            rows.add(new Object[]{
                mov.getId(),
                mov.getProduto().getDescricao(),
                mov.getQuantidade(),
                TipoMovimento.valueOfDefault(mov.getTipoMovimento()).getValue()
            });
        });
        table.setModel(new TableModelUtil(rows, cols));
        table.getColumnModel().getColumn(0).setPreferredWidth(60); //codigo
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(350); //descricao
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(90); //estoque
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(120); //movimento
        table.getColumnModel().getColumn(3).setResizable(false);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getTableHeader().setReorderingAllowed(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setRowSelectionAllowed(true);

    }

    private void addMovimento() {
        this.movimento.setDataMovimento(LocalDate.now());
        this.movimento.setObservacao(textAreaObservacao.getText());
        this.movimento.setProduto(item);

        for (AbstractButton button : Collections.list(movimentoButtonGroup.getElements())) {
            if (button.isSelected()) {
                movimento.setTipoMovimento(button.getText());
            }
        }

        try {
            String qtd = fieldEstoque.getText();
            if (Strings.isNullOrEmpty(qtd)) {
                throw new IllegalArgumentException("Não é possível inserir valor inferior a 1\nFavor verificar e tentar novamente!");
            }

            Integer qtdEntrada = Integer.valueOf(qtd);
            this.movimento.setQuantidade(qtdEntrada);
            if (Objects.equals(movimento.getTipoMovimento(), TipoMovimento.SAIDA.getValue())
                    && (qtdEntrada > this.item.getQuantidadeMinima() || this.item.getQuantidadeMinima() == 0)) {
                throw new IllegalArgumentException("Estoque abaixa da quantidade fornecida\nFavor verificar e tentar novamente!");
            }

            if (Objects.equals(movimento.getTipoMovimento(), TipoMovimento.ENTRADA.getValue())
                    || Objects.equals(movimento.getTipoMovimento(), TipoMovimento.DEVOLUCAO.getValue())) {
                qtdEntrada = this.item.getQuantidadeMinima() + qtdEntrada;
                this.item.setQuantidadeMinima(qtdEntrada);
            } else {
                qtdEntrada = this.item.getQuantidadeMinima() - qtdEntrada;
                this.item.setQuantidadeMinima(qtdEntrada);
            }

            this.service.salvar(this.movimento);

            this.service = new ProdutoService();
            this.service.salvar(this.item);
            this.limparMovinemtno();
            this.loadTable();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }

    public void limparMovinemtno() {
        LimparFields.clean(fieldPanel);
        this.movimento = new MovimentoEstoque();
        this.cmdAdicionar.setEnabled(false);
    }
}
