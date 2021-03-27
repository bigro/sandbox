# ndiag-sample
[ndiag](https://github.com/k1LoW/ndiag)を動かしてみるリポジトリ
## ローカル準備
```
cd docker
docker-compose up -d
docker exec -it ndiag-command bash
cd /home/ndiag/sample
```
あとはお好きなndiagコマンドを
```
ndiag doc -c ndiag.yml --rm-dist
```