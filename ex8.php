<?php
header("Content-Type: text/html; charset=UTF-8");
?>
<html>

<head>
    <title>演習11-8</title>
    <link rel="stylesheet" href="style.css">
</head>
<h1>演習11-8</h1>
<body>

<?php
$pref = "都道府県";
$capital = "県庁所在地";
$geoInfo = array(
    array ( "pref" => "東京都", "capital" => "東京都" ),
    array ( "pref" => "神奈川県", "capital" => "横浜市" ),
    array ( "pref" => "埼玉県", "capital" => "さいたま市" ),
    array ( "pref" => "千葉県", "capital" => "千葉市" ),
);

$t="<table border='1'>\n";
$t.="<thead>\n";
$t.="<th>".$pref."</th>\n";
$t.="<th>".$capital."</th>\n";
$t.="</thead>\n";
$t.="<tbody>\n";
foreach ($geoInfo as $row){
    $t.="<tr>\n";
    foreach($row as $key_1=>$val){
        $t.="<td>".htmlspecialchars($val)."</td>\n";
    }
    $t.="</tr>\n";
}
$t.="</tbody>\n";
$t.="</table>\n";
print $t;
?>

</body>
</html>
