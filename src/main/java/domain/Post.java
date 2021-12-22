package domain;

public class Post {
    private String textPost;
    private String linksPost; //ссылка поста
    private int id; // поле из документации
    private CommunityName communityName; // в документации он id типа int, я под такой тип объекта создала отдельный класс CommunityName с заголовком группы и датой и временем
    private int ownerId; // поле из документации
    private int fromId; // поле из документации
    private int createdBy; // поле из документации
    private int date; // поле из документации
    private int replyOwnerId; // поле из документации
    private int friendsOnly; // поле из документации
    private String postType; // Поле из документации
    private int signerId; // поле из документации
    private int canPin; // поле из документации
    private int canDelete; // поле из документации
    private int canEdit; // поле из документации
    private int isPinned; // поле из документации
    private int markedAsAds; // поле из документации
    private boolean isFavorite; // поле из документации
    private int postponedId; // поле из документации
    private LikesPost likesPost; // в документации он типа object, под такой тип объекта мы создали отдельный класс LikesPost
    private Share share; // в документации он типа object, под такой тип объекта мы создали отдельный класс Share
    private ViewsPost viewsPost; // в документации он типа object, под такой тип объекта мы создали отдельный класс ViewsPost
    private PostSource postSource; // в документации он типа object, под такой тип объекта мы создали отдельный класс PostSource
    private Geo geo; // в документации он типа object, под такой тип объекта мы создали отдельный класс Geo
    private Place place; // в документации он типа object, под такой тип объекта мы создали отдельный класс Place
    private Donut donut; // в документации он типа object, под такой тип объекта мы создали отдельный класс Donut
    private Placeholder placeholder; // в документации он типа object, под такой тип объекта мы создали отдельный класс Placeholder

    // + get/set на все поля
}
