FROM alpine

RUN apk update && apk add nginx git

RUN mkdir -p /run/nginx /var/www/localhost/htdocs

RUN echo 'server { \
    listen 80 default_server; \
    listen [::]:80 default_server; \
    root /var/www/localhost/htdocs; \
    index index.html; \
    location / { \
        try_files $uri $uri/ =404; \
    } \
}' > /etc/nginx/http.d/default.conf

RUN git clone https://github.com/Alvar-234/ordinario-ftw.git /tmp/repo && \
    cp -r /tmp/repo/* /var/www/localhost/htdocs/ && \
    rm -rf /tmp/repo

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
