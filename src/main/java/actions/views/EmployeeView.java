package actions.views;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 従業員情報について画面の入力値・出力値を扱うViewモデル
 *
 */
@Getter // すべてのクラスフィールドについてgetterを自動生成する（Lombok）
@Setter // すべてのクラスフィールドについてsetterを自動生成する（Lombok）
@NoArgsConstructor // 引数なしコンストラクタを自動生成する（Lombok）
@AllArgsConstructor // すべてのクラスフィールドを引数にもつ引数ありコンストラクタを自動生成する（Lombok）
public class EmployeeView {

    /**
     * id
     */
    private Integer id;

    /**
     * 社員番号
     */
    private String code;

    /**
     * 氏名
     */
    private String name;

    /**
     * パスワード
     */
    private String password;

    /**
     * 管理者権限があるかどうか
     */
    private Integer adminFlag;

    /**
     * 登録日時
     */
    private LocalDateTime createdAt;

    /**
     * 更新日時
     */
    private LocalDateTime updatedAt;

    /**
     * 削除された従業員かどうか（現役：０，削除済み：１）
     */
    private Integer deleteFlag;

}
